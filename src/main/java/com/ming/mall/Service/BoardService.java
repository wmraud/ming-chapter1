package com.ming.mall.Service;

import java.util.List;

import com.ming.mall.VO.BoardVO;

public interface BoardService {

	// �Խñ� �ۼ�
	public void write(BoardVO boardVO) throws Exception;
	// �Խù� ��� ��ȸ
	public List<BoardVO> list() throws Exception;
	// �Խù� ��� ����ȸ
	public BoardVO read(int bno) throws Exception;
	
}