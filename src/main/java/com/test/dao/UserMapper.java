package com.test.dao;

import com.test.entity.User;

public interface UserMapper {
    int insert(User record);
    int insertSelective(User record);
    User selectByPrimaryKey(int userId);
}