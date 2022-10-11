package com.example.demo.member;

import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // service bean으로 등록
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	

	@Override
	public User login(Map<String, String> map) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
}
