package com.pro.sm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * className:LoginInterceptor
 * discriptoin:拦截器
 * author:孙家庆
 * createTime:2018-11-10 16:39
 */
/*11111111111*/
    /*Ryb修改*/
    /*凡哥第一次修改*/
    /*孙家庆修改*/
    /*管辉的修改*/
    /* 张晓峰修改*/
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //进入业务之前执行的方法
        System.out.println("进入业务之前经过了过滤器。。。。。。。。。。。");
        /*Object userName = request.getSession().getAttribute("userName");
        if(userName==null){
            response.sendRedirect("/sb/emp/login");
            return false;
        }else{
            return true;
        }*/
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("视图渲染之前调用的方法。。。。。。。。。。。");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("无论如何都会执行的方法。。。。。。。。。。。。。");
    }
}
