package com.ming.mall.DAO;

import com.ming.mall.VO.BoardVO;

public interface BoardDAO {

	// 게시글 작성
	public void write(BoardVO boardVO) throws Exception;
}