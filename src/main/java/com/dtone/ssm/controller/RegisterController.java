package com.dtone.ssm.controller;

import com.dtone.ssm.entity.UserEntity;
import com.dtone.ssm.service.ILogService;
import com.dtone.ssm.service.IUserService;
import com.dtone.ssm.service.imp.LogServiceImp;
import com.dtone.ssm.util.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.sql.Time;
import java.util.Date;

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

    @Autowired
    ILogService logService = new LogServiceImp();

    @RequestMapping("user/register")
    public String register(UserEntity userEntity, HttpServletRequest request) {
        log.error("收到请求:user/register :" + userEntity);
        if (userService.insertUser(userEntity)) {
            HttpSession session = request.getSession();
            session.setAttribute("name",userEntity.getRealname());
            session.setAttribute("isLogin",true);
            session.setAttribute("level","");
            log.info("返回响应:user/login" + "注册成功");
            logService.userLogin("注册账号：" + userEntity.getName() + " 【状态：成功】", TimeUtil.getCurTime());
            return "success";
        }
        logService.userLogin("注册账号：" + userEntity.getName() + " 【状态：失败】", TimeUtil.getCurTime());
        log.info("返回响应: user/login" + "注册失败");
        return "false";
    }
}
