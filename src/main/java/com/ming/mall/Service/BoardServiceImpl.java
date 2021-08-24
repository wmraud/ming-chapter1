package com.ming.mall.Service;

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

}