/**
 * @program: safecity
 * @description: 专家拦截器
 * @author: TwinIsland
 * @create: 2020-10-28 21:56
 **/

package com.dtone.ssm.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class ZjInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("资料管理员用户拦截器启动");
        return request.getSession().getAttribute("level") != "zj";
    }
}

