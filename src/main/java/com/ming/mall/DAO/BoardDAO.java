package com.ming.mall.DAO;

import java.util.List;

import com.ming.mall.VO.BoardVO;

public interface BoardDAO {

	// �Խñ� �ۼ�
	public void write(BoardVO boardVO) throws Exception;
	// �Խù� ��� ��ȸ
	public List<BoardVO> list() throws Exception;
}