package com.xxt.boot.web.service;

import org.springframework.stereotype.Service;

/**
 * @Auther: haytt.xiang
 * @Date: 2020/5/19 11:05
 * @Description:
 */
@Service
public class SimpleService {

    public String say(String name) {
        System.out.println("hhhh");
        return name + "sss";
    }
}
