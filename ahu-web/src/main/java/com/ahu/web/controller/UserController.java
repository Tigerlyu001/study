package com.ahu.web.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ahu.common.pojo.User;
import com.ahu.common.vo.SysResult;
import com.ahu.web.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/doLogin")
	@ResponseBody
	public SysResult userLogin(User user,HttpSession session){
		
		try{
			User userinfo = userService.findUser(user);
			if(userinfo!=null){
				session.setAttribute("username", userinfo.getUsername());
				return SysResult.oK(userinfo);
			}else return SysResult.build(201, "账号密码错误，请重新输入");
		}catch (Exception e) {
			return SysResult.build(201, "账号密码错误，请重新输入");
		}
		
		
	}
}
