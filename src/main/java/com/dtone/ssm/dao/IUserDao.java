package com.dtone.ssm.dao;

import com.dtone.ssm.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

//用户映射器接口
@Mapper //用于扫描映射器接口
public interface IUserDao {
    @Select("select * from tb_user where u_name = #{name} and u_password = #{password}")
    @Results(value = {
            @Result(property = "id",column = "u_id",id=true),
            @Result(property = "name",column = "u_name"),
            @Result(property = "password",column = "u_password"),
            @Result(property = "level",column = "u_level"),
            @Result(property = "realname",column = "u_realname"),
    })
    public UserEntity selectUser(@Param("name") String name,@Param("password") String password);

    @Select("select * from tb_user")
    @Results(value = {
            @Result(property = "id",column = "u_id",id=true),
            @Result(property = "name",column = "u_name"),
            @Result(property = "password",column = "u_password"),
            @Result(property = "level",column = "u_level"),
            @Result(property = "realname",column = "u_realname"),
    })
    public List<UserEntity> selectAllUser();

    @Insert("insert into tb_user (u_id,u_name,u_password,u_level,u_realname) values (null,#{name},#{password},#{level},#{realname})")
    public void insertUser(UserEntity userEntity);

    @Delete("delete from tb_user where u_id = #{id}")
    public void deleteUser(int id);

    @Select("select u_realname from tb_user where u_name = #{name}")
    public String selectSpecUserName(String name);

    //判断用户名是否重复
    @Select("select count(*) from tb_user where u_name = #{name}")
    public int selectUserCount(String name);
}
