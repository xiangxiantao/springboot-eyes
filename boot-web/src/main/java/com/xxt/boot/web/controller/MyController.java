package com.xxt.boot.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @RequestMapping("/index")
    public String index() {
        System.out.println("/index");
        return "welcome xgimi";
    }

    @RequestMapping("/index2")
    public String index2() {
        System.out.println("/index2");
        return "welcome3 xgimi";
    }

}
