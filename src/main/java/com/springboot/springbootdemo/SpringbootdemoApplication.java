package com.springboot.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
//@SpringBootApplication是Spring Boot 项目的核心注解，
// 主要目的是开启自动配置。main方法是一个标准的Java应用的main方法，
// 主要作用是作为项目启动的入口。
public class SpringbootdemoApplication {

	@RequestMapping("/")
	String index() {
		return "Hello SpringBoot";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdemoApplication.class, args);
	}
}
