package com.example.demo.join;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.User;

@Service
public class JoinServiceImpl implements JoinService{
	
	@Autowired
	JoinMapper joinMapper;
	
	public void saveUser(User user) {
		joinMapper.saveUser(user);
	}
}
