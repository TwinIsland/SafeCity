package com.dtone.ssm.service;

//用户业务逻辑接口
public interface IUserService {
    //校验用户账号和密码
    public boolean checkUser(String name,String password);
}
