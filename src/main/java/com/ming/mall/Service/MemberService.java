package com.ming.mall.Service;

import com.ming.mall.VO.MemberVO;

public interface MemberService {
    //ȸ������
	public void register(MemberVO vo) throws Exception;
	//�α���
	public MemberVO login(MemberVO vo) throws Exception;
	//ȸ����������
	public void memberUpdate(MemberVO vo) throws Exception;
	//ȸ��Ż��
	public void memberDelete(MemberVO vo) throws Exception;
}