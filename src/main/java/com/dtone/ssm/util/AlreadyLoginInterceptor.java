/**
 * @program: safecity
 * @description: 对已登录用户拦截
 * @author: TwinIsland
 * @create: 2020-10-27 16:14
 **/

package com.dtone.ssm.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class AlreadyLoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("登录用户拦截器启动");
        if(request.getSession().getAttribute("isLogin") != null){
            response.sendRedirect("index.html");
            return false;
        }
        return true;
    }
}

