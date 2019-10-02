/**
 * 
 */
package com.example.demo.controller;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.OssUser;
import com.example.demo.domain.Result;
import com.example.demo.domain.User;
import com.example.demo.domain.UserResource;
import com.example.demo.exception.ApplicationException;
import com.example.demo.service.UserService;

/**
 * @author Administrator
 *
 */
@RestController("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/errTest")
	public void exceptionTest() {
		if(true)
			throw new ApplicationException("发生错误，出现异常");
	}
	
	@RequestMapping(value = "/addUser")
	public Result addUser() {
		OssUser user = new OssUser();
		user.setUserName("azz");
		user.setUserPwd("123456");
		user.setUserPhone("123123123");
		
		userService.addUser(user);
		
		return Result.success("");
	}
	

}
