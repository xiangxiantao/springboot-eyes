package com.xxt.bootwebjsp.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MyController {


    @RequestMapping("/index2")
    @ResponseBody
    public String index2() {
        System.out.println("/index2");
        return "welcome3 xgimi";
    }

    @RequestMapping("/success")
    public String success(Model model){
        model.addAttribute("msg","12324234");
        return "success";
    }

}
