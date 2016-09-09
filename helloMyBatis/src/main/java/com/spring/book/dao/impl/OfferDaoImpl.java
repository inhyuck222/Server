package com.spring.book.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.book.dao.OfferDao;
import com.spring.book.model.Offer;

@Repository("offerDao")
public class OfferDaoImpl implements OfferDao{

	@Autowired
	private SqlSession sqlSession;
	
	public void setSqlSession(SqlSession sqlSession){
		this.sqlSession = sqlSession;		
	}

	@Override
	public List<Offer> getOfferList() {
		return sqlSession.selectList("getOfferList");
	}

}
