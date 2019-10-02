package com.example.demo.mapper;

import com.example.demo.domain.OssUser;
import com.example.demo.utils.MyMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OssUserMapper extends MyMapper<OssUser> {
}