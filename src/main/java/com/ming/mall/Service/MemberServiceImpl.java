package com.ming.mall.Service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ming.mall.DAO.MemberDAO;
import com.ming.mall.VO.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject MemberDAO dao;
	//회원가입
	@Override
	public void register(MemberVO vo) throws Exception {
		
		dao.register(vo);
		
	}
	//로그인
	@Override
    public MemberVO login(MemberVO vo) throws Exception {
	return dao.login(vo);
    }
	
	//Controller에서 보내는 파라미터들을 memberUpdate(MemberVO vo)로 받고 , 회원정보수정
	@Override
	public void memberUpdate(MemberVO vo) throws Exception {
		
		//받은 vo를 DAO로 보내줍니다.
		dao.memberUpdate(vo);
		
	}
	
	// 업데이트에서 처리한 내용과 같습니다. , 회원탈퇴
    @Override
    public void memberDelete(MemberVO vo) throws Exception {
	dao.memberDelete(vo);
}
    // 패스워드 체크
    @Override
    public int passChk(MemberVO vo) throws Exception {
    	int result = dao.passChk(vo);
    	return result;
    }
	
}