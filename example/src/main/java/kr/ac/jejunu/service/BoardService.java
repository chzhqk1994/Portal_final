package kr.ac.jejunu.service;

import kr.ac.jejunu.domain.BoardVO;

import java.util.List;

public interface BoardService {

    public void register(BoardVO boardVO) throws Exception;

    public BoardVO read(Integer bno) throws Exception;

    public void modify(BoardVO boardVO) throws Exception;

    public void delete(Integer bno) throws Exception;

    public List<BoardVO> listAll() throws Exception;

}