package com.ming.mall.DAO;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ming.mall.VO.BoardVO;
import com.ming.mall.VO.Criteria;
import com.ming.mall.VO.SearchCriteria;

@Repository
public class BoardDAOImpl implements BoardDAO {

	@Inject
	private SqlSession sqlSession;
	
	// �Խñ� �ۼ�
	@Override
	public void write(BoardVO boardVO) throws Exception {
		sqlSession.insert("boardMapper.insert", boardVO);
	}
	// �Խù� ��� ��ȸ
	@Override
	public List<BoardVO> list(SearchCriteria scri) throws Exception {
		// TODO Auto-generated method stud
		return sqlSession.selectList("boardMapper.listPage", scri);
	}
	// �Խù� �� ������ �� ����
		@Override
		public int listCount(SearchCriteria scri) throws Exception {
			// TODO Auto-generated method stud
			return sqlSession.selectOne("boardMapper.listCount", scri);
		}
	// �Խù� ����ȸ
	@Override
	public BoardVO read(int bno) throws Exception {		
		return sqlSession.selectOne("boardMapper.read", bno);
	}
	// �Խù� ����
	@Override
	public void update(BoardVO boardVO) throws Exception {
			sqlSession.update("boardMapper.update", boardVO);
	}
	// �Խù� ����
	@Override
	public void delete(int bno) throws Exception {
		sqlSession.delete("boardMapper.delete", bno);
	}
}