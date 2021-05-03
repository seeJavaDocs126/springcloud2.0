package com.joyin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wd
 * @Classname Payment8001_APP
 * @Description TODO
 * @Date 2021-05-03 11:11
 * @Version V1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8002_APP {
    public static void main(String[] args) {
        SpringApplication.run(Payment8002_APP.class,args);
    }
}
