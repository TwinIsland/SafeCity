package com.dtone.ssm.controller;

import com.dtone.ssm.entity.UserEntity;
import com.dtone.ssm.service.ILogService;
import com.dtone.ssm.service.IUserService;
import com.dtone.ssm.service.imp.LogServiceImp;
import com.dtone.ssm.util.TimeUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;


/**
 * @author: 周垣枳
 * @desc: 用户页面控制器
 **/
@RestController
@RequestMapping("html/")
@Slf4j //获取日志对象
public class UserController {
    @Autowired
    private IUserService userService;

    @Autowired
    ILogService logService = new LogServiceImp();
    //获取日志对象（用于写调试日志）
    //private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("user/login")
    public String login(String name, String password, HttpServletRequest request) {
        log.info("收到请求:user/login :" + "name =" + name + "password=" + password);
        if (userService.checkUser(name, password)) {
            HttpSession session = request.getSession();
            session.setAttribute("name",userService.getUsrRealName(name));
            session.setAttribute("isLogin",true);
            session.setAttribute("level","superadmin");
            logService.userLogin("登录账号：" + name + " 【状态：成功】", TimeUtil.getCurTime());
            log.info("返回响应:user/login" + "登陆成功");
            return "success";
        }
        logService.userLogin("登录账号：" + name + " 【状态：失败】",TimeUtil.getCurTime());
        log.error("返回响应: user/login" + "登录失败");
        return "false";
    }

    @RequestMapping("user/getName")
    public String getName(HttpServletRequest request){
        //log.info("Session: " + request.getSession().getId());
        Object uName = request.getSession().getAttribute("name");
        if(uName == null){
            return "false";
        }
        return uName.toString();
    }

    @RequestMapping("user/logout.action")
    public void logout(HttpServletRequest request){
        request.getSession().invalidate();
    }

    @RequestMapping("user/isLogin.action")
    public boolean isLogin(HttpServletRequest request){
        return request.getSession().getAttribute("isLogin") != null;
    }

    @RequestMapping("user/setLevel")
    public void setLevel(int id,String level){
        userService.setLevel(id,level);
    }

    @RequestMapping("user/getUser")
    public List<UserEntity> getAllUser(){
        return userService.selectAllUser();
    }

}
