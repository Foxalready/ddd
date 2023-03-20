package com.example.demo;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableAsync
@EnableTransactionManagement
@MapperScan("com.example.demo.mapper")
@Log4j2
public class DemoApplication {

    Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {

        ConfigurableApplicationContext ctx = SpringApplication.run(DemoApplication.class, args);
        print(ctx);
    }

    private static void print(ConfigurableApplicationContext ctx) {
        ConfigurableEnvironment environment = ctx.getEnvironment();
        String name = environment.getProperty("server.name");
        String port = environment.getProperty("server.port");
//        log.info("name={},port={}", name, port);
    }

}
