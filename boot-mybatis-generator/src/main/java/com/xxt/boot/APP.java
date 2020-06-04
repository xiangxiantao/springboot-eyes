package com.xxt.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Auther: haytt.xiang
 * @Date: 2020/5/25 15:42
 * @Description:
 */
@SpringBootApplication
@MapperScan("com.xxt.boot.dao")
public class APP {

    public static void main(String[] args) {
        SpringApplication.run(APP.class,args);
    }
}
