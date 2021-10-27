package com.ming.mall.Service;

import java.util.List;

import com.ming.mall.VO.BoardVO;
import com.ming.mall.VO.Criteria;

public interface BoardService {

	// �Խñ� �ۼ�
	public void write(BoardVO boardVO) throws Exception;
	// �Խù� ��� ��ȸ
	public List<BoardVO> list(Criteria cri) throws Exception;
	// �Խñ� �� ������ �� ����
	public int listCount() throws Exception;
	// �Խù� ��� ����ȸ
	public BoardVO read(int bno) throws Exception;
	// �Խù� ����
	public void update(BoardVO boardVO) throws Exception;
	// �Խù� ����
	public void delete(int bno) throws Exception;
	
}