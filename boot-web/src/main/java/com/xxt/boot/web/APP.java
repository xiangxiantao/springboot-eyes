package com.xxt.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

@SpringBootApplication
public class APP {
    public static void main(String[] args) {
        SpringApplication.run(APP.class, args);
    }

    @Bean
    public ViewResolver myViewResolver(){
        return new ViewResolver() {
            @Override
            public View resolveViewName(String s, Locale locale) throws Exception {
                return null;
            }
        };
    }
}
