/**
 * 
 */
package com.example.demo.controller;



import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;
import com.example.demo.domain.UserResource;
import com.example.demo.exception.ApplicationException;

/**
 * @author Administrator
 *
 */
@RestController("/user")
public class UserController {
	
	@Autowired
	UserResource userResource;
	
	@RequestMapping("/getUser")
	public User getUser() {
		User user = new User();
		user.setName("jack");
		user.setPassword("123456");
		user.setBirthDate(new Date());
		user.setDesc("hhhhh");
		
		System.out.println(userResource);
		
		
		return user;
	}
	
	@RequestMapping(value = "/errTest")
	public void exceptionTest() {
		if(true)
			throw new ApplicationException("发生错误，出现异常");
	}

}
