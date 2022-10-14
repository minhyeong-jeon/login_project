package com.example.demo.user;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
	public User searchUser(User user) throws Exception;
}