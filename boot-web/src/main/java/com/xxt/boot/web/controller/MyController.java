package com.xxt.boot.web.controller;

import com.xxt.boot.web.exception.UserNotExistException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    //@RequestMapping("/index")
    //public String index() {
    //    System.out.println("/index");
    //    return "welcome xgimi";
    //}123

    @RequestMapping("/index2")
    public String index2(@RequestParam("user") String user) {
        if (user.equals("aaa")){
            throw new UserNotExistException();
        }
        System.out.println("/index2");
        return "welcome3 xgimi";
    }

}
