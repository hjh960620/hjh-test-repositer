/**
 *
 */
package com.example.demo.service;

import java.util.List;

import com.example.demo.domain.UserQuarm;
import com.example.demo.mapper.OssUserMineMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.OssUser;
import com.example.demo.domain.User;
import com.example.demo.mapper.OssUserMapper;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.Sqls;
import tk.mybatis.mapper.util.StringUtil;

/**
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    OssUserMapper userMapper;

    @Autowired
    OssUserMineMapper userMineMapper;

    //配置事务，隔离级别为默认，传播级别为require
    @Transactional(propagation = Propagation.REQUIRED)
    public void addUser(OssUser user) {

        userMapper.insert(user);
    }

    //配置事务，隔离级别为默认，传播级别为supports
    @Transactional(propagation = Propagation.SUPPORTS)
    public OssUser getUseById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<OssUser> getUserList() {
        // TODO Auto-generated method stub
        return userMapper.selectAll();
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteByPrimaryKey(id);

    }

    @Override
    public void updateUser(OssUser user) {

//		userMapper.updateByPrimaryKey(user);
        userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public List<OssUser> getUserByQuarm(UserQuarm userQuarm) {

        //表示实例化同时传递了一个对象给构造方法, 这个对象是一个Class对象
        Example example = new Example(OssUser.class);
        //创建一个Criteria对象
        Example.Criteria criteria = example.createCriteria();

        if (StringUtil.isNotEmpty(userQuarm.getUserStatus())) {
            //相当于 status=''
            criteria.andEqualTo("userStatus", userQuarm.getUserStatus());
        }

        if (StringUtil.isNotEmpty(userQuarm.getUserName())) {
//			相当于user_name like '%%'
//			criteria.andCondition("user_name like"+"'"+"%"+userQuarm.getUserName()+"%"+"'");
            criteria.andLike("userName", "%" + userQuarm.getUserName() + "%");
        }
        //设置排序
        example.setOrderByClause("id asc");

        //执行
        List<OssUser> userList = userMapper.selectByExample(example);


        return userList;
    }

    @Override
    public List<OssUser> loadUserList() {
        return userMineMapper.loadUserList();
    }


}
