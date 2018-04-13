//package com.example.common.swagger;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
///**
// * @Author: yifeng G
// * @Date: Create in 11:41 2018/4/9 2018
// * @Description:
// * @Modified By:
// * @Vsersion:
// */
//@Configuration
//@EnableSwagger2
//public class Swagger {
//
//    @Bean
//    public Docket createRestApi(){
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.example.controller"))
//                .paths(PathSelectors.any())
//                .build();
//    }
//
//    private ApiInfo apiInfo(){
//        return new ApiInfoBuilder()
//                .title("Spring Boot中使用Swagger2构建RESTful APIs")
////                .description("描述")
//                .termsOfServiceUrl("http://zsx.com.cn")
//                .contact("hefei-gyf") // 无所谓（这里是作者的别称）
//                .version("2.0")
//                .build();
//    }
//
//}