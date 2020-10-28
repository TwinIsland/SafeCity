/**
 * @program: safecity
 * @description: 拦截器配置
 * @author: TwinIsland
 * @create: 2020-10-27 15:53
 **/

package com.dtone.ssm.util;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebAppConfig extends WebMvcConfigurerAdapter  {

    public void addInterceptors(InterceptorRegistry registry) {

        InterceptorRegistration registration = registry.addInterceptor(new LoginInterceptor());
        registration.addPathPatterns("/html/dashboard.html");
        registration.addPathPatterns("/html/logout.html");
        registration.addPathPatterns("/html/log.html");
        registration.addPathPatterns("/html/zoneManage.html");
        registration.addPathPatterns("/html/medicationManage.html");
        registration.addPathPatterns("/html/applyTakeMed.html");


        InterceptorRegistration registration2 = registry.addInterceptor(new AlreadyLoginInterceptor());
        registration2.addPathPatterns("/html/login.html");
    }
}

