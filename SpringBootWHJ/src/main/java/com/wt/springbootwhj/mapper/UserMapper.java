package com.wt.springbootwhj.mapper;

import com.wt.springbootwhj.domain.User;
import org.apache.ibatis.annotations.*;


@Mapper
public interface UserMapper {
    @Select("select * from basic_user where user_name=#{user_name}")
    User selectByUsername(
            @Param("user_name") String user_name);

    @Select("select * from basic_user where phone=#{phone} and password=#{password}")
    User selectUserByLogin(User user);

    @Select("select count(user_id) from basic_user where phone=#{phone}")
    int selectUserByPhone(User user);

    @Insert("insert into basic_user(user_name,phone,password) values(#{user_name},#{phone},#{password})")
    void insertUser(User user);

    @Select("select * from basic_user where  phone=#{phone}")
    User isExist(User user);

    @Update("update(basic_user) set password=#{password} where user_id=#{user_id}")
    Boolean updataUser(User user);
}
