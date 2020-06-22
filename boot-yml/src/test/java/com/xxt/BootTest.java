package com.xxt;

import com.xxt.entity.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.UnsupportedEncodingException;

@SpringBootTest
@RunWith(SpringRunner.class)
public class BootTest {

    @Autowired
    private Person person;

    @Test
    public void contextload(){
        System.out.println(person);
    }
    
    @Test
    public void testString() throws UnsupportedEncodingException {
        String str=new String("\u6fc0\u6d3b\u7801\u4e0d\u5b58\u5728".getBytes(),"utf8");
        System.out.println(str);

    }

}
