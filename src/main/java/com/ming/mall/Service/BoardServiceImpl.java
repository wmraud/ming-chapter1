package com.ming.mall.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ming.mall.VO.BoardVO;
import com.ming.mall.DAO.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {

	@Inject
	private BoardDAO dao;
	
	// 게시글 작성
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}
	// 게시물 목록 조회
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}
	// 게시물 상세 조회
	@Override
	public BoardVO read(int bno) throws Exception {
		return dao.read(bno);
	}
	//게시글 수정
	@Override
	public void update(BoardVO boardVO) throws Exception {
		dao.update(boardVO);
	}
	//게시글 삭제
	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}

}