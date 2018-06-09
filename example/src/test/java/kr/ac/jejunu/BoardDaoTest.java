package kr.ac.jejunu;

import kr.ac.jejunu.domain.BoardVO;
import kr.ac.jejunu.persistance.BoardDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.inject.Inject;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:**/applicationContext.xml"})
public class BoardDaoTest {

    @Inject
    private BoardDAO boardDAO;

    @Test
    public void testCreate() throws Exception {
        BoardVO boardVO = new BoardVO();
        boardVO.setTitle("New Post");
        boardVO.setContent("Nse post's content");
        boardVO.setWriter("user00");
        boardDAO.create(boardVO);
    }

    @Test
    public void testRead() throws Exception {
        boardDAO.read(1);

    }

    @Test
    public void testUpdate() throws Exception {
        BoardVO boardVO = new BoardVO();
        boardVO.setBno(1);
        boardVO.setTitle("수정된 글입니다...");
        boardVO.setContent("수정된 글 내용입니다...");
        boardDAO.update(boardVO);
    }

    @Test
    public void testDelete() throws Exception {
        boardDAO.delete(1);
    }


}