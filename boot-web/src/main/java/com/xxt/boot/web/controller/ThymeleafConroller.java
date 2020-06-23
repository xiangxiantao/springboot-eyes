package com.xxt.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class ThymeleafConroller {

    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("name","xiangxiantao");
        map.put("users", Arrays.asList("xxt","lxh","zxf","lxj"));
        return "success";
    }

}
