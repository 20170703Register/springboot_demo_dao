package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
 * 排除数据源自动配置，不添加数据库地址也能正常运行SpringBoot
 */
@SpringBootApplication
public class SpringbootDemoDaoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootDemoDaoApplication.class, args);
    }

}
