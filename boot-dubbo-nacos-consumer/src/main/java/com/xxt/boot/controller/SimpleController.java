package com.xxt.boot.controller;

import com.xxt.boot.service.SimpleService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: haytt.xiang
 * @Date: 2020/5/29 15:23
 * @Description:
 */
@RestController
public class SimpleController {

    @Reference(version = "1.0.0",group = "group1")
    private SimpleService simpleService;

    @RequestMapping("/index")
    public String index() {
        return simpleService.work("xxt");
    }

}
