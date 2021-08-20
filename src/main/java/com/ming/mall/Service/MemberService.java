package com.ming.mall.Service;

import com.ming.mall.VO.MemberVO;

public interface MemberService {
    //회원가입
	public void register(MemberVO vo) throws Exception;
	//로그인
	public MemberVO login(MemberVO vo) throws Exception;
	//회원정보수정
	public void memberUpdate(MemberVO vo) throws Exception;
	//회원탈퇴
	public void memberDelete(MemberVO vo) throws Exception;
}