package com.joyin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wd
 * @Classname PaymentConsul8004_App
 * @Description TODO
 * @Date 2021-05-04 22:53
 * @Version V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsumerConsul9082_App {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerConsul9082_App.class, args);
    }
}

