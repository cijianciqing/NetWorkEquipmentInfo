package jsjzx.wlyw.sb004.config;

import jsjzx.wlyw.sb004.component.MyLocaleResolver;
import jsjzx.wlyw.sb004.component.MyLoginInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("atguigu").setViewName("success");//用于测试
        registry.addViewController("/").setViewName("asset/list");
        registry.addViewController("/main.html").setViewName("/asset/list");
        registry.addViewController("/bootstrapT").setViewName("/asset/list");
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
/*
//暂时禁用，其他功能测试完成后再启用
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
//        springboot已经做好论文静态资源映射
        registry.addInterceptor(new MyLoginInterceptor()).addPathPatterns("/*")
                .excludePathPatterns("/index.html","/","user/lgin");
    }*/
}
