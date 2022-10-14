package com.example.demo.join;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.example.demo.user.User;

@Repository
@Mapper
public interface JoinMapper {
	void saveUser(User user);
}
