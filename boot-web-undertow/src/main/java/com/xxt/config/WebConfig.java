package com.xxt.config;

import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义嵌入式servlet容器的两种方式
 * 方法一：程序化定制嵌入式容器：向容器中注入一个WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>类型的bean，
 *        其中ConfigurableServletWebServerFactory代表着现存的嵌入式容器，可以是springboot自带的，也可以是自己自定义注入的
 * 方法二：自定义嵌入式容器（自己注入一个容器bean）：向容器中直接注入一个ConfigurableServletWebServerFactory，
 *        其类型目前有三种：UndertowServletWebServerFactory
 *                       TomcatServletWebServerFactory
 *                       JettyServletWebServerFactory
 * 当容器中同时存在WebServerFactoryCustomizer和自定义的ConfigurableServletWebServerFactory，首先加载自定义容器，并加载其属性，
 * 再利用WebServerFactoryCustomizer的配置将原来的属性进行互补和覆盖
 */
@Configuration
public class WebConfig {

    /**
     * 方法2：自定义嵌入式容器
     * @return
     */
    @Bean
    public ConfigurableServletWebServerFactory webServerFactory(){
        UndertowServletWebServerFactory webServerFactory = new UndertowServletWebServerFactory();
        webServerFactory.setPort(7777);
        webServerFactory.setContextPath("/factoryyyyyyyy");
        return webServerFactory;
    }

    /**
     * 方法1：程序化定制嵌入式容器
     * @return
     */
    @Bean
    public WebServerFactoryCustomizer webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableServletWebServerFactory>() {
            @Override
            public void customize(ConfigurableServletWebServerFactory factory) {
                factory.setPort(9999);
            }
        };
    }

}
