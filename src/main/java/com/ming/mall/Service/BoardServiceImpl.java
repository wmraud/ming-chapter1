package com.ming.mall.Service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ming.mall.VO.BoardVO;
import com.ming.mall.VO.Criteria;
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
	public List<BoardVO> list(Criteria cri) throws Exception {
		return dao.list(cri);
	}
	// �Խñ� �� ������ �� ����
	@Override
	public int listCount() throws Exception {
		return dao.listCount();
	}
	// �Խù� �� ��ȸ
	@Override
	public BoardVO read(int bno) throws Exception {
		return dao.read(bno);
	}
	//�Խñ� ����
	@Override
	public void update(BoardVO boardVO) throws Exception {
		dao.update(boardVO);
	}
	//�Խñ� ����
	@Override
	public void delete(int bno) throws Exception {
		dao.delete(bno);
	}

}