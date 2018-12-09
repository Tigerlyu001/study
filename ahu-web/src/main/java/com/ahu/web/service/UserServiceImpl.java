package com.ahu.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ahu.common.pojo.User;
import com.ahu.web.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	
	public User findUser(User user) {
		// TODO Auto-generated method stub
		return userMapper.findUser(user);
	}

}
