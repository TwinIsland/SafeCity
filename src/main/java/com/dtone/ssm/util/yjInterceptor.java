/**
 * @program: safecity
 * @description: 库房管理员拦截器
 * @author: TwinIsland
 * @create: 2020-10-28 21:57
 **/

package com.dtone.ssm.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Slf4j
public class yjInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("库房管理员拦截器启动");
        return request.getSession().getAttribute("level") != "yj";
    }
}

