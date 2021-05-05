package com.joyin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wd
 * @Classname ConsumerPaymentZookeeper9081_App
 * @Description TODO
 * @Date 2021-05-04 21:16
 * @Version V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerPaymentZookeeper9081_App {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerPaymentZookeeper9081_App.class,args);
    }
}
