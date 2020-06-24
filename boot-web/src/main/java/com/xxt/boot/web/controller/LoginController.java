package com.xxt.boot.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password") String password,
                        Map<String, Object> map,
                        HttpSession session){
        if (!StringUtils.isEmpty(username) && "123456".equals(password)){
            //为了防止表单重复提交，重定向到main.html这个路径，这个路径实际指向dashboard
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }else {
            map.put("msg", "用户名密码错误");
            return "login";
        }
    }

}
