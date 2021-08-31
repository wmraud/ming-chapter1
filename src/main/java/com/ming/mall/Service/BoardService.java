package com.ming.mall.Service;

import java.util.List;

import com.ming.mall.VO.BoardVO;
import com.ming.mall.VO.Criteria;
import com.ming.mall.VO.SearchCriteria;

public interface BoardService {

	// �Խñ� �ۼ�
	public void write(BoardVO boardVO) throws Exception;
	// �Խù� ��� ��ȸ
	public List<BoardVO> list(SearchCriteria scri) throws Exception;
	// �Խñ� �� ������ �� ����
	public int listCount(SearchCriteria scri) throws Exception;
	// �Խù� ��� ����ȸ
	public BoardVO read(int bno) throws Exception;
	// �Խù� ����
	public void update(BoardVO boardVO) throws Exception;
	// �Խù� ����
	public void delete(int bno) throws Exception;
	
}