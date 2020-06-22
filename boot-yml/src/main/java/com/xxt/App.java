package com.xxt;

import com.xxt.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @Autowired
    private Person person;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @GetMapping("/index")
    public Person index(){
        return person;
    }

}
