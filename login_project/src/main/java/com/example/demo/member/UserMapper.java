package com.example.demo.member;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
	public User login(Map<String, String> map);
	
}
