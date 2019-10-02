/**
 * 
 */
package com.example.demo.service;



import java.util.List;

import com.example.demo.domain.OssUser;
import com.example.demo.domain.User;
import com.example.demo.domain.UserQuarm;

/**
 * @author Administrator
 *
 */
public interface UserService {
	
	 void addUser(OssUser user);

	OssUser getUseById(Integer id);

	List<OssUser> getUserList();
	 void deleteUser(Integer id);
	 void updateUser(OssUser user);

	List<OssUser> getUserByQuarm(UserQuarm userQuarm);

	//自定义mapper测试
	List<OssUser> loadUserList();

}
