package com.example.demo.member;

import java.util.Map;

public interface UserService {
	public User login(Map<String, String > map) throws Exception;
}