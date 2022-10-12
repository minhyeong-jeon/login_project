package com.example.demo.user;

import java.util.Map;
public interface UserService {
	

	
	//public User login(Map<String, String > map) throws Exception;

	public User doUserLogin(String strLUserId) throws Exception;
		

}