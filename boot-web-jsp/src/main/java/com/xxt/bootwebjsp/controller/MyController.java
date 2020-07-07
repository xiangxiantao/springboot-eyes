package com.xxt.bootwebjsp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {


    @RequestMapping("/index2")
    @ResponseBody
    public String index2() {
        System.out.println("/index2");
        return "welcome3 xgimi";
    }

}
