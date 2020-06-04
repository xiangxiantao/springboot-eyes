package com.xxt.boot.web;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.xgimi.commons.util.HttpClientUtil;
import com.xxt.boot.web.controller.MyController;
import com.xxt.boot.web.service.SimpleService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Auther: haytt.xiang
 * @Date: 2020/5/19 10:59
 * @Description:
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class HttpUtilTest {

    public static final String URL = "http://127.0.0.1:9090";

    @Autowired
    SimpleService simpleService;

    @Autowired
    RestTemplate restTemplate;

    @Test
    public void test1() {
        simpleService.say("xxt");
    }

    @Test
    public void testSendHttp() {
        Gson gson = new GsonBuilder().create();
        String location = URL + "/order/list";
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("orderId", "201901121745000041536237");
        String s = HttpClientUtil.sendGet(location, parameters);
        System.out.println(s);

    }

    @Test
    public void testRestTemplate(){
        String location = URL + "/order/list?orderId={orderId}";
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("orderId", "201901121745000041536237");
        String forObject = restTemplate.getForObject(location, String.class,parameters);
        System.out.println(forObject);
    }

}
