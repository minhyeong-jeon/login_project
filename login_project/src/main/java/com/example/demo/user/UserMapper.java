package com.example.demo.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
	//public User login(Map<String, String> map);

	
	public User doUserLogin(String strLoginId) throws Exception;
	
}
