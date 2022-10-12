package com.example.demo.join;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.user.User;

@Mapper
public interface JoinMapper {

	void saveUser(User user);
}
