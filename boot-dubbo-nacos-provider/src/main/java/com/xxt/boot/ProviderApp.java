package com.xxt.boot;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: haytt.xiang
 * @Date: 2020/5/29 15:13
 * @Description:
 */
@SpringBootApplication
@EnableDubbo
public class ProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApp.class, args);
    }
}
