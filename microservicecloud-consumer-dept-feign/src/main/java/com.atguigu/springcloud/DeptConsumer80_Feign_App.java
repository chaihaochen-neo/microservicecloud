package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们的自定义Ribbon配置类，从而使配置生效
//@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
//@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class) *configuration和ComponentScan不能在同一个包下
@EnableFeignClients(basePackages= {"com.atguigu.springcloud"})
@ComponentScan(basePackages = {"com.atguigu.springcloud"})
public class DeptConsumer80_Feign_App {

    public static void main(String[] args) {

        SpringApplication.run(DeptConsumer80_Feign_App.class,args);
    }
}
