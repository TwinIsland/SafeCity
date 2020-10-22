package com.dtone.ssm.dao;

import com.dtone.ssm.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//用户映射器接口
@Mapper //用于扫描映射器接口
public interface IUserDao {
    @Select("select * from tb_user where name = #{name} and password = #{password}")
    public UserEntity selectUser(@Param("name") String name,@Param("password") String password);

    public List<UserEntity> selectAllUser();
}
