package kr.co.shootthem.service;

import java.util.List;

import org.springframework.stereotype.Service;

import kr.co.shootthem.model.User;

public interface UserService {
	
	User getUser(String userId);
	
}
