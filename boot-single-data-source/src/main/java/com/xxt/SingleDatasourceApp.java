package com.xxt;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xxt.mapper"})
public class SingleDatasourceApp {

    public static void main(String[] args) {
        SpringApplication.run(SingleDatasourceApp.class, args);
    }

}
