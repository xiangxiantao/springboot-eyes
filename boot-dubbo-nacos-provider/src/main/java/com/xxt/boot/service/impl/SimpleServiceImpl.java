package com.xxt.boot.service.impl;

import com.xxt.boot.exception.BaseException;
import com.xxt.boot.service.SimpleService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @Auther: haytt.xiang
 * @Date: 2020/5/29 15:15
 * @Description:
 */

@Service(version = "1.0.0" , group = "group1" )
@Component
public class SimpleServiceImpl implements SimpleService {

    @Override
    public String work(String person) {
        if (person.equals("erro")){
            throw new BaseException("我自己的error异常", "MEG00001");
        }
        return "person:" + person + "working";
    }

}
