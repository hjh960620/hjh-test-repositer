/**
 * 
 */
package com.example.demo.controller;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.domain.User;

/**
 * @author Administrator
 *
 */
@Slf4j
@Controller
public class ThymeleafTester {
	
	@RequestMapping("/thTest")
	public ModelAndView test(ModelAndView modelAndView) {
		
		User user1 = new User();
		user1.setName("胡俊豪");
		user1.setPassword("123456");
		user1.setSex(0);
		user1.setBirthDate(new Date());
		user1.setDesc("<font color='green'>hello word</font>");
		
		User user2 = new User();
		user2.setName("胡俊豪2");
		user2.setPassword("123456789");
		user2.setSex(1);
		user2.setBirthDate(new Date());
		user2.setDesc("<font color='green'>hello word</font>");
		
		User user3 = new User();
		user3.setName("胡俊豪3");
		user3.setPassword("123456qwe");
		user3.setSex(0);
		user3.setBirthDate(new Date());
		user3.setDesc("<font color='green'>hello word</font>");

		User user4 = new User();
		user4.setName("胡俊豪3");
		user4.setPassword("123456qwe");
		user4.setSex(0);
		user4.setBirthDate(new Date());
		user4.setDesc("<font color='green'>hello word</font>");
		
		List<User>userList = new ArrayList<>();
		userList.add(user1);
		userList.add(user2);
		userList.add(user3);

		log.info("日志测试");
		log.info(user1.toString());


		modelAndView.addObject("user", user1);
		modelAndView.addObject("userList",userList);
		modelAndView.setViewName("/test");
		return modelAndView;
		
	}
	
	@PostMapping("/addUser")
	public void addUser(User user) {
		System.out.println(user.toString());
	}

}
