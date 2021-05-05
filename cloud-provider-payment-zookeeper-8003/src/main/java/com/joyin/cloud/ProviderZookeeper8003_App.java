package com.joyin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author wd
 * @Classname ProviderZookeeper8003_App
 * @Description TODO
 * @Date 2021-05-04 20:58
 * @Version V1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ProviderZookeeper8003_App {
    public static void main(String[] args) {
        SpringApplication.run(ProviderZookeeper8003_App.class,args);
    }

}
