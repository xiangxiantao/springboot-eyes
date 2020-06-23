package com.xxt.boot.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * WebMvcConfigurationSupport:会导致springboot对springmvc的自动配置失效
 * WebMvcConfigurerAdapter：已过期
 * WebMvcConfigurer：java8已经支持deflut方法的接口，所以可以直接使用这个接口
 */
@Configuration
//public class springmvcConfig extends WebMvcConfigurationSupport {
//public class springmvcConfig extends WebMvcConfigurerAdapter {
public class springmvcConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/woziji").setViewName("success");
    }
}
