package com.xxt.controller;

import com.xxt.entity.SysLog;
import com.xxt.mapper.SystemLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

@RestController
public class TestController {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private SystemLogMapper systemLogMapper;

    @RequestMapping("/index")
    public String index() {
        SysLog sysLog = systemLogMapper.selectById(1L);
        return sysLog.toString();
    }

}
