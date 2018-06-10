package kr.ac.jejunu.service;

import kr.ac.jejunu.domain.BoardVO;
import kr.ac.jejunu.persistance.BoardDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Inject
    private BoardDAO boardDAO;

    @Override
    public void register(BoardVO boardVO) throws Exception {
        boardDAO.create(boardVO);
    }

    @Transactional(isolation = Isolation.READ_COMMITTED)
    @Override
    public BoardVO read(Integer bno) throws Exception {
        boardDAO.updateViewCnt(bno);
        return boardDAO.read(bno);
    }

    @Override
    public void modify(BoardVO boardVO) throws Exception {
        boardDAO.update(boardVO);
    }

    @Override
    public void delete(Integer bno) throws Exception {
        boardDAO.delete(bno);
    }

    @Override
    public List<BoardVO> listAll() throws Exception {
        return boardDAO.listAll();
    }
}