package com.example;

import com.example.common.config.DynamicDataSourceRegister;
import com.example.utils.kafka.Sender;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

/**
 * @Author: yifeng G
 * @Date: Create in 14:55 2018/4/3 2018
 * @Description:
 * @Modified By:
 * @Vsersion:
 */
@SpringBootApplication
@Import({DynamicDataSourceRegister.class}) // 注册动态多数据源
public class Application {
    public static void main(String[] args) {
        ApplicationContext app= SpringApplication.run(Application.class, args);
        while (true) {
            Sender sender = app.getBean(Sender.class);
            sender.sendMessage();
            try {
                Thread.sleep(2000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
