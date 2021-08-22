package com.ming.mall.Service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ming.mall.DAO.MemberDAO;
import com.ming.mall.VO.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Inject MemberDAO dao;
	//ȸ������
	@Override
	public void register(MemberVO vo) throws Exception {
		
		dao.register(vo);
		
	}
	//�α���
	@Override
    public MemberVO login(MemberVO vo) throws Exception {
	return dao.login(vo);
    }
	
	//Controller���� ������ �Ķ���͵��� memberUpdate(MemberVO vo)�� �ް� , ȸ����������
	@Override
	public void memberUpdate(MemberVO vo) throws Exception {
		
		//���� vo�� DAO�� �����ݴϴ�.
		dao.memberUpdate(vo);
		
	}
	
	// ������Ʈ���� ó���� ����� �����ϴ�. , ȸ��Ż��
    @Override
    public void memberDelete(MemberVO vo) throws Exception {
	dao.memberDelete(vo);
}
    // �н����� üũ
    @Override
    public int passChk(MemberVO vo) throws Exception {
    	int result = dao.passChk(vo);
    	return result;
    }
	
}