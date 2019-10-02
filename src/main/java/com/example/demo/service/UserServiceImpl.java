/**
 * 
 */
package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.OssUser;
import com.example.demo.domain.User;
import com.example.demo.mapper.OssUserMapper;

/**
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	OssUserMapper userMapper;

	@Override
	public void addUser(OssUser user) {
		
		userMapper.insert(user);
	}

	@Override
	public User getUseById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getUserList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateUser(OssUser user) {
		// TODO Auto-generated method stub
		
	}

	

}
