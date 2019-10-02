/**
 * 
 */
package com.example.demo.service;



import java.util.List;

import com.example.demo.domain.OssUser;
import com.example.demo.domain.User;

/**
 * @author Administrator
 *
 */
public interface UserService {
	
	 void addUser(OssUser user);
	 User getUseById(Integer id);
	 List<User> getUserList();
	 void deleteUser(Integer id);
	 void updateUser(OssUser user);

}
