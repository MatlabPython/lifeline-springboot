package com.springboot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: yifeng G
 * @Date: Create in 14:55 2018/4/3 2018
 * @Description:
 * @Modified By:
 * @Vsersion:
 */
@SpringBootApplication
@RestController
public class Application {
    @RequestMapping("/")
    public String home(){
        return "go home";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
