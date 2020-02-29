package com.atguigu.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    @Bean
    @LoadBalanced   //SpringCloud Ribbon 是基于Netflix Ribbon实现的一套客户端 负载均衡工具
    //默认轮询算法
    public RestTemplate getRestTemplate(){

        return new RestTemplate();
    }

//    @Bean
//    public IRule myRule(){
//
//       // return new RandomRule();//随机算法
//        return new RetryRule();//先按照轮询策略获取服务，如果获取服务失败则在指定时间内进行重试，获取可用服务。
//    }
}
