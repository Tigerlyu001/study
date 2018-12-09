package com.ahu.web.mapper;

import org.apache.ibatis.annotations.Select;

import com.ahu.common.pojo.User;

public interface UserMapper {
	@Select("select username,password from user where username = #{username} and password = #{password}")
	User findUser(User user);
}
