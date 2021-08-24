package com.ming.mall.Service;

import java.util.List;

import com.ming.mall.VO.BoardVO;

public interface BoardService {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
	// 게시물 목록 조회
	public List<BoardVO> list() throws Exception;
	// 게시물 목록 상세조회
	public BoardVO read(int bno) throws Exception;
	
}