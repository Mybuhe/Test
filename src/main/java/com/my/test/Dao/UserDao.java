package com.my.test.Dao;

import org.apache.ibatis.annotations.Param;

public interface UserDao {
    public List<User> selectUser(@Param("userRole") Integer userRole,@Param("userName") String userName);
}
