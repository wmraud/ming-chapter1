package com.ming.mall.DAO;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ming.mall.VO.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {
	
	@Inject SqlSession sql;
	// ȸ������

	@Override
	public void register(MemberVO vo) throws Exception {
		sql.insert("memberMapper.register", vo);
	}
	
	// �α���
	@Override
	public MemberVO login(MemberVO vo) throws Exception {
		
		return sql.selectOne("memberMapper.login", vo);
	}
	
	//���񽺿��� ���� �Ķ���͵��� memberUpdate(MemberVO vo)�� ����ϴ�. , ȸ������ ����
	@Override
	public void memberUpdate(MemberVO vo) throws Exception {
		// vo�� ��� �Ķ���͵��� memberMapper.xml�� memberMapper��� namespace�� 
		// ���̵� memberUpdate�� ������ �Ķ���͵��� �־��ݴϴ�.
		sql.update("memberMapper.memberUpdate", vo); 
	}
	
	// ������Ʈ�� ���������� �帧�� �����ϴ�. , ȸ��Ż��
    @Override
    public void memberDelete(MemberVO vo) throws Exception {
	// MemberVO�� ��� ������ �����ݴϴ�.
	// �׷� xml���� memberMapper.memberDelete�� ���ø�
	//  #{userId}, #{userPass}�� �Ķ���Ͱ��� ��Ī�� �ǰ�����.
	sql.delete("memberMapper.memberDelete", vo);
	
}
 // �н����� üũ
    @Override
    public int passChk(MemberVO vo) throws Exception {
    	int result = sql.selectOne("memberMapper.passChk", vo);
    	return result;
    }
 // ���̵� �ߺ� üũ
    @Override
    public int idChk(MemberVO vo) throws Exception {
    	int result = sql.selectOne("memberMapper.idChk", vo);
    	return result;
    }
	
}