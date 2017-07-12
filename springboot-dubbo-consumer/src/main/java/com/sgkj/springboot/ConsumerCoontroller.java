package com.sgkj.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerCustomizer;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class ConsumerCoontroller    extends SpringBootServletInitializer implements EmbeddedServletContainerCustomizer {

    @Autowired
    private DemoService userService;

    @RequestMapping("/home")
    @ResponseBody
    public String home() {
        return userService.getUserName();
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ConsumerCoontroller.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ConsumerCoontroller.class);
    }

    //修改启动端口
    @Override
    public void customize(ConfigurableEmbeddedServletContainer container) {
        container.setPort(8081);
    }
}