package com.xxt.config;

import com.xxt.web.MySimpleFilter;
import com.xxt.web.MySimpleListener;
import com.xxt.web.MySimpleServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.Arrays;

@Configuration
public class WebConfig {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean=new ServletRegistrationBean(new MySimpleServlet(),"/myservlet");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setFilter(new MySimpleFilter());
        filterFilterRegistrationBean.setUrlPatterns(Arrays.asList("/myservlet"));
        return filterFilterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean servletListenerRegistrationBean(){
        ServletListenerRegistrationBean servletListenerRegistrationBean= new ServletListenerRegistrationBean();
        servletListenerRegistrationBean.setListener(new MySimpleListener());
        return servletListenerRegistrationBean;
    }

}
