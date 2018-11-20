package com.pro.sm;

import com.pro.sm.interceptor.LoginInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * className:MvcConfigClass
 * discription:
 * author:sjq
 * createTime:2018-11-20 18:48
 */
public class MvcConfigClass implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //添加自定义拦截器  配置拦截路径addPathPatterns和不拦截的路径excludePathPatterns
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/emp/toUpload","/emp/toLogin","/emp/login","/emp/toSessionLogin");
    }
}
