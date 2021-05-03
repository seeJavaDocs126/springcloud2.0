package com.joyin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wd
 * @Classname Payment9080_APP
 * @Description TODO
 * @Date 2021-05-03 13:00
 * @Version V1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment9080_APP {
    public static void main(String[] args) {
        SpringApplication.run(Payment9080_APP.class,args);
    }
}
