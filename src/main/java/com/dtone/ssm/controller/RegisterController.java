package com.dtone.ssm.controller;

import com.dtone.ssm.entity.UserEntity;
import com.dtone.ssm.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author 周垣枳
 * @desc
 * @data 2020/10/26 16:53
 */
@RestController
@Slf4j //获取日志对象
public class RegisterController {
    @Autowired
    private IUserService userService;

    @RequestMapping("user/register")
    public String register(UserEntity userEntity, HttpServletRequest request) {
        log.error("收到请求:user/register :" + userEntity);
        if (userService.insertUser(userEntity)) {
            HttpSession session = request.getSession();
            session.setAttribute("name",userEntity.getRealname());
            log.info("返回响应:user/login" + "注册成功");
            return "success";
        }
        log.info("返回响应: user/login" + "注册失败");
        return "false";
    }
}
