/**
 * @program: safecity
 * @description: 用户登录拦截器
 * @author: TwinIsland
 * @create: 2020-10-27 15:32
 **/

package com.dtone.ssm.util;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Binge
 * @desc 拦截器类
 * @date 2020/10/15 上午11:28
 */
public class LoginInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截点1");

        return (boolean)request.getSession().getAttribute("isLogin"); //返回值 true：请求通过   false:请求被拦截
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("拦截点2");
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("拦截点3");
        super.afterCompletion(request, response, handler, ex);
    }
}
