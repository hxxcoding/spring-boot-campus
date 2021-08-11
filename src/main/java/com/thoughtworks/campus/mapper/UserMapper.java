package com.thoughtworks.campus.mapper;


import com.thoughtworks.campus.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user")
    List<User> queryAllUser();

    @Insert("insert into user(id,username,password) values (#{id},#{username},#{password})")
    void insertUser(User user);
}
