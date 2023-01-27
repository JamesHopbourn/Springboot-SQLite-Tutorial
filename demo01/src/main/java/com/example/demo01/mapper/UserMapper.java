package com.example.demo01.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo01.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper extends BaseMapper<User> {
}
