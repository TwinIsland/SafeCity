/**
 * @program: safecity
 * @description: 灾情管理员拦截器
 * @author: TwinIsland
 * @create: 2020-10-28 21:55
 **/

package com.dtone.ssm.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j //获取日志对象
public class ZqInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("灾情管理员拦截器启动");
        response.sendRedirect("login.html");
        return request.getSession().getAttribute("level") != "zq";
    }
}
