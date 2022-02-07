package com.yijiang.intercepter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Auther: jiangyi
 * @Date: 2021-12-27
 * @Description: com.yijiang.intercepter
 */
@Component
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    private TestInterceptor demoInterceptor;
    //配置拦截器的映射
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(demoInterceptor).addPathPatterns("/**").excludePathPatterns("/login");
    }

}
