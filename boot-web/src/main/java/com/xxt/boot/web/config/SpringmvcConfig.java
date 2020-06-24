package com.xxt.boot.web.config;

import com.xxt.boot.web.component.LoginHandlerIntercepter;
import com.xxt.boot.web.component.MyLocalResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
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
public class SpringmvcConfig implements WebMvcConfigurer {

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocalResolver();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/woziji").setViewName("success");
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/index").setViewName("login");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    /**
     * 添加拦截器，单springboot2之后的拦截器胡拦截静态资源，需要将静态资源的访问路径排除掉
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerIntercepter())
                .addPathPatterns("/**")
                .excludePathPatterns("/", "/index", "/user/login")
                .excludePathPatterns("/asserts/**","/webjars/**");
    }

    /**
     * 配置静态资源访问路径与文件路径的对应关系，默认可以采用springboot的配置
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
    }
}
