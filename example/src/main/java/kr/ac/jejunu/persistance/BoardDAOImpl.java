package kr.ac.jejunu.persistance;

import kr.ac.jejunu.domain.BoardVO;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import java.util.List;

@Repository
public class BoardDAOImpl implements BoardDAO {

    private static final Logger logger = LoggerFactory.getLogger(BoardDAOImpl.class);

    @Inject
    private SqlSession sqlSession;

    private static final String NAMESPACE = "kr.ac.jejunu.mapper.BoardMapper";

    // 게시글 입력
    @Override
    public void create(BoardVO boardVO) throws Exception {
        sqlSession.insert(NAMESPACE + ".create", boardVO);
    }

    // 게시글 조회
    @Override
    public BoardVO read(Integer bno) throws Exception {
        return sqlSession.selectOne(NAMESPACE + ".read", bno);
    }

    // 게시글 수정
    @Override
    public void update(BoardVO vo) throws Exception {
        sqlSession.update(NAMESPACE + ".update", vo);
    }

    // 게시글 삭제
    @Override
    public void delete(Integer bno) throws Exception {
        sqlSession.delete(NAMESPACE + ".delete", bno);
    }

    // 게시글 전체 목록
    @Override
    public List<BoardVO> listAll() throws Exception {
        return sqlSession.selectList(NAMESPACE + ".listAll");
    }

// 게시물 조회 수
    @Override
    public void updateViewCnt(Integer bno) throws Exception {
        sqlSession.update(NAMESPACE + ".updateViewCnt", bno);
    }
}