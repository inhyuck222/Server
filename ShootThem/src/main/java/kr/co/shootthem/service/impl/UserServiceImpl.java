package kr.co.shootthem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.shootthem.dao.UserDao;
import kr.co.shootthem.model.User;
import kr.co.shootthem.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public User getUser(String userId){
		return userDao.getUser(userId);		
	}

}
