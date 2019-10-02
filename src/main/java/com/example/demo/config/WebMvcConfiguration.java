package com.example.demo.config;

import com.example.demo.interceptors.InterceptorsTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Author Hu junhao
 * Create 2019/10/2
 */
@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer {


    /**
     * 添加拦截器
     *
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        //按照拦截器顺序拦截
        registry.addInterceptor(new InterceptorsTest()).addPathPatterns("/*/**");
    }
}
