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
	
	// �Խñ� �ۼ�
	@Override
	public void write(BoardVO boardVO) throws Exception {
		dao.write(boardVO);
	}
	// �Խù� ��� ��ȸ
	@Override
	public List<BoardVO> list() throws Exception {
		return dao.list();
	}
	// �Խù� �� ��ȸ
	@Override
	public BoardVO read(int bno) throws Exception {

		return dao.read(bno);
	}

}