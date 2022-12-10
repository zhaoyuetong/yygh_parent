package com.atzyt.yygh.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//取消数据源自动配置(exclude = DataSourceAutoConfiguration.class)
@ComponentScan(basePackages = "com.atzyt")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.atzyt")
public class ServiceUserApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceUserApplication.class, args);
    }
}
