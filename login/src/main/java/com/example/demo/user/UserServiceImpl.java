package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(String id) throws Exception {
		User user = userMapper.login(id);
		return user;
	}
	
	/*
	 * public User login(Map<String, String> map) throws Exception { return
	 * userMapper.login(map); }
	 */
	

}
