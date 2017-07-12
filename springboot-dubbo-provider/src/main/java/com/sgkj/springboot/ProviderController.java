package com.sgkj.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//加注解@SpringBootApplication在这个类之上，让spring boot能够发现这个类，并启动这个类的main方法
@SpringBootApplication
public class ProviderController {
	public static void main(String[] args) {
		SpringApplication.run(ProviderController.class, args);
	}
	
    @RequestMapping("/home")
    @ResponseBody
    String home() {
        return "Hello world";
    }
}
