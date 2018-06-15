package kr.ac.jejunu.controller;

import kr.ac.jejunu.domain.BoardVO;
import kr.ac.jejunu.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.inject.Inject;

@Controller
@RequestMapping("/board")
public class BoardController {

    private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

    @Inject
    private BoardService boardService;

    // 게시글 입력페이지
    @RequestMapping(value = "/register", produces = "text/plain;charset=UTF-8", method = RequestMethod.GET)
    public void registerGET(BoardVO boardVO, Model model) throws Exception {
        logger.info("registerGET() : called... ");

    }

    // 게시글 입력처리
    @RequestMapping(value = "/register", produces = "text/plain;charset=UTF-8", method = RequestMethod.POST)
    public String registerPOST(BoardVO boardVO, Model model, RedirectAttributes rttr) throws Exception {
        logger.info("registerPOST() : called...");
        logger.info("Inserted BoardVO : " + boardVO);
        boardService.register(boardVO);
        rttr.addFlashAttribute("msg", "INSERT"); // redirect되는 시점에 한번만 사용되는 데이터 전송

        return "redirect:/board/listAll";
    }

    // 게시글 전체 목록
    @RequestMapping(value = "/listAll", produces = "text/plain;charset=UTF-8", method = RequestMethod.GET)
    public String listAll(Model model) throws Exception {

        logger.info("listAll() : called...");
        logger.info("GET list : " + boardService.listAll());
        model.addAttribute("list", boardService.listAll());

        return "board/list_all";
    }

    // 게시글 조회
    @RequestMapping(value = "/read", produces = "text/plain;charset=UTF-8", method = RequestMethod.GET)
    public String read(@RequestParam("bno") int bno, Model model) throws Exception {

        logger.info("read() : called...");
        logger.info("Get boardVO : " + boardService.read(bno));
        model.addAttribute("boardVO",boardService.read(bno));

        return "board/read";
    }

    // 게시글 수정페이지
    @RequestMapping(value = "/modify", produces = "text/plain;charset=UTF-8", method = RequestMethod.GET)
    public String modifyGET(@RequestParam("bno") int bno, Model model) throws Exception {

        logger.info("modifyGET() : called...");
        logger.info("Get boardVO : " + boardService.read(bno));
        model.addAttribute("boardVO", boardService.read(bno));

        return "/board/modify";
    }


    // 게시글 수정처리
    @RequestMapping(value = "/modify", produces = "text/plain;charset=UTF-8", method = RequestMethod.POST)
    public String modifyPOST(BoardVO boardVO, RedirectAttributes rttr) throws Exception {

        logger.info("modifyPOST() : called...");
        logger.info("Modified boardVO : " + boardVO);
        boardService.modify(boardVO);
        int bno = boardVO.getBno();
        rttr.addFlashAttribute("msg", "MODIFY");
        System.out.println("checkbox status : " + boardVO.getStatus());

        return "redirect:/board/read?bno="+bno;

    }

    // 게시글 삭제처리
    @RequestMapping(value = "/remove", produces = "text/plain;charset=UTF-8", method = RequestMethod.POST)
    public String remove(@RequestParam("bno") int bno, RedirectAttributes rttr) throws Exception {

        logger.info("remove() : called...");
        logger.info("bno : " + bno);
        boardService.delete(bno);
        rttr.addFlashAttribute("msg", "DELETE");

        return "redirect:/board/listAll";

    }

}