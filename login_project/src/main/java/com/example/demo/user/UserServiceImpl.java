package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service // service bean으로 등록
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userDao;

	@Override
	public User doUserLogin(String strLUserId) throws Exception {
		User user = userDao.doUserLogin(strLUserId);
		return user;
	}
}
