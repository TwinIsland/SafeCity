/**
 * @program: safecity
 * @description: 用户登录拦截器
 * @author: TwinIsland
 * @create: 2020-10-27 15:32
 **/

package com.dtone.ssm.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Binge
 * @desc 拦截器类
 * @date 2020/10/15 上午11:28
 */
@Slf4j //获取日志对象
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("未登录用户拦截器启动");
        if (request.getSession().getAttribute("isLogin") == null ||
                request.getSession().getAttribute("isLogin") == "") {
            response.sendRedirect("login.html");
            return false;
        }
        return true;
    }
}
