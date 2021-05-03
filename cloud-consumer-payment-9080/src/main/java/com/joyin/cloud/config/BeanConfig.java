package com.joyin.cloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author wd
 * @Classname BeanConfig
 * @Description TODO
 * @Date 2021-05-03 13:07
 * @Version V1.0
 */
@Configuration
public class BeanConfig {
    @Bean
    @LoadBalanced
    public RestTemplate initTemplate(){
        return new RestTemplate();
    }
}
