package com.ming.mall.Service;

import com.ming.mall.VO.BoardVO;

public interface BoardService {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
	
}