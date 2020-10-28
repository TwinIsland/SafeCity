package com.dtone.ssm.service;

import com.dtone.ssm.entity.UserEntity;

import java.util.List;

//用户业务逻辑接口
public interface IUserService {
    //校验用户账号和密码
    public boolean checkUser(String name,String password);

    //获取所以用户
    public List<UserEntity> selectAllUser();

    //获取用户真实名称
    public String getUsrRealName(String name);

    //注册账号
    public boolean insertUser(UserEntity userEntity);

    //更新权限
    public void setLevel(int id, String level);

    public String getLevel(String name,String password);
}
