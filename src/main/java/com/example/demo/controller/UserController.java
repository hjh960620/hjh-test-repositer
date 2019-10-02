/**
 * 
 */
package com.example.demo.controller;



import java.util.Date;
import java.util.List;

import com.example.demo.domain.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.ApplicationException;
import com.example.demo.service.UserService;

/**
 * @author Administrator
 *
 */
@RestController()
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
		user.setUserName("azz1");
		user.setUserPwd("123456");
		user.setUserPhone("123123123");
		
		userService.addUser(user);
		
		return Result.success("");
	}

	@RequestMapping(value = "/updateUser")
	public Result updateUser() {
		OssUser user = new OssUser();
		user.setId(82);
		user.setUserName("azz3");
		user.setUserPwd("123456");
		user.setUserPhone("123123123");

		userService.updateUser(user);

		return Result.success("");
	}

	@RequestMapping(value = "/deleteUser/{id}")
	public Result deleteUser(@PathVariable Integer id) {
		userService.deleteUser(id);

		return Result.success("");
	}

	@RequestMapping(value = "/getUser")
	public Result getUserById() {
		return Result.success(userService.getUseById(66));
	}

	@RequestMapping(value = "/getUserList")
	public Result getUserList() {

		return Result.success(userService.getUserList());
	}

	@RequestMapping(value = "/getUserQuarm")
	public Result getUserByQuarm() {

		UserQuarm userQuarm = new UserQuarm();
		userQuarm.setUserName("ad");
		userQuarm.setUserStatus("0");
		List<OssUser> userList = userService.getUserByQuarm(userQuarm);

		return Result.success(userList);
	}

	//	在定义mapper测试
	@RequestMapping(value = "/loadUserList")
	public Result loadUserList() {
		return Result.success(userService.loadUserList());
	}

	//	分页测试
	@RequestMapping(value = "/getUserListPage")
	public Result getUserListPage() {

		//实际使用过程中要参数要包含分页的起始页数page和每页的数量size
		Integer page = 1;
		Integer size = 5;

		//通过PageHelper.startPage(page,size)开始分页，它会将该语句之后第一个查询sql进行分页
		PageHelper.startPage(page, size);
		List<OssUser> userList = userService.getUserList();

		//使用PageInfo获得分页对象，该对象包含了总分页数、总数量等信息
		PageInfo<OssUser> pageInfo = new PageInfo<>(userList);

		return Result.success(pageInfo);
	}



}
