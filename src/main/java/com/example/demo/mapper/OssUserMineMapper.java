package com.example.demo.mapper;

import com.example.demo.domain.OssUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Author Hu junhao
 * Create 2019/10/2
 * 自定义mapper
 */
@Mapper
public interface OssUserMineMapper {
    List<OssUser> loadUserList();
}
