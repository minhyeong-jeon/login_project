package com.example.demo.user;


import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;


@Mapper
@Repository
public interface UserMapper{

	
	public User login(String id) throws Exception;
	//public User login(Map<String, String> map);
}