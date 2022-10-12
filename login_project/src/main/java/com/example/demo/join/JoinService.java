package com.example.demo.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.User;

@Service
public class JoinService {
	@Autowired
	JoinMapper joinMapper;
	
	public void joinUser(User user) {
		user.setUserName(user.getUserName());
		user.setUserDate(user.getUserDate());
		user.setUserId(user.getUserId());
		user.setUserPass(user.getUserPass());
		
		joinMapper.saveUser(user);
	}
}
