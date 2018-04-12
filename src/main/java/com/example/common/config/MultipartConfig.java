package com.example.common.config;

import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.servlet.MultipartConfigElement;

/**
 * @Author: yifeng G
 * @Date: Create in 11:21 2018/4/9 2018
 * @Description:springboot里默认使用tomcat的上传文件大小限制，即1MB
 * @Modified By:
 * @Vsersion:
 */
@Configuration
public class MultipartConfig {

    @Bean
    public MultipartConfigElement multipartConfigElement(){
        MultipartConfigFactory factory = new MultipartConfigFactory();
        factory.setMaxFileSize("10MB");
        factory.setMaxRequestSize("10MB");
        return factory.createMultipartConfig();
    }

}
