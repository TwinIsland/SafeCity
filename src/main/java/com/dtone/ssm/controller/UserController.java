package com.dtone.ssm.controller;

import com.dtone.ssm.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: 周垣枳
 * @desc: 用户页面控制器
 **/
@RestController
@Slf4j //获取日志对象
public class UserController {
    @Autowired
    private IUserService userService;

    //获取日志对象（用于写调试日志）
    //private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("user/login")
    public String login(String name,String password){
        log.error("收到请求:user/login :" + "name =" + name + "password=" + password);
        if(userService.checkUser(name,password)){
            log.info("返回响应:user/login" + "登陆成功");
            return "success";
        }
        log.info("返回响应: user/login" + "登录失败");
        return "false";
    }
}
