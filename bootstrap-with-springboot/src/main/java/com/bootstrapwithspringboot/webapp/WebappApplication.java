package com.bootstrapwithspringboot.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
This project is based on:
1) spring boot crud:
   https://progressive-code.com/post/10/Simple-Spring-Boot-CRUD-application-with-Thymeleaf,-JPA-and-Bootstrap

2) spring boot bootstrap:
   https://medium.com/@omeryazir/how-to-integrate-spring-boot-with-bootstrap-and-thymeleaf-5744fc8475d

3) thymeleaf layout:
    https://dzone.com/articles/spring-boot-thymeleaf-template-decorator-using-thy
 */
@SpringBootApplication
public class WebappApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebappApplication.class, args);
    }
}
