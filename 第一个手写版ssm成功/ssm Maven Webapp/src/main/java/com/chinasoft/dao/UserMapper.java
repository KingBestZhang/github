package com.chinasoft.dao;

import org.springframework.stereotype.Component;

import com.chinasoft.enity.User;
@Component("userDao")
public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}