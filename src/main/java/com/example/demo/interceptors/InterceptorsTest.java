package com.example.demo.interceptors;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Author Hu junhao
 * Create 2019/10/2
 * 拦截器
 * 需要实现HandlerInterceptor接口
 */
public class InterceptorsTest implements HandlerInterceptor {


    /**
     * 在请求处理之前调用（Controller方法调用之前）
     *
     * @param request
     * @param response
     * @param handler
     * @return
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        System.out.println("被拦截器拦截了-----");
        String url = request.getRequestURL().toString();
        System.out.println(url);
        if (url.equals("html")) {
            return false;
        }
        return true;
    }

    /**
     * 在请求处理之后调用（Controller方法调用之后），但在视图渲染之前
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 在整个请求结束后被调用，主要用来资源清理工作
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
