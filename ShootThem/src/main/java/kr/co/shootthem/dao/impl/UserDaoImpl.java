package kr.co.shootthem.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.co.shootthem.dao.UserDao;
import kr.co.shootthem.model.User;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private SqlSession sqlSession;

	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public User getUser(String userId) {
		String id = userId;
		return sqlSession.selectOne("getUser", id);
	}

}