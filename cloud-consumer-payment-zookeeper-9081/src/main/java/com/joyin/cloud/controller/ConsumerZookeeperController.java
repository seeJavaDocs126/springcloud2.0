package com.joyin.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author wd
 * @Classname ConsumerZookeeper9081_App
 * @Description TODO
 * @Date 2021-05-04 21:11
 * @Version V1.0
 */
@RestController
public class ConsumerZookeeperController {

    public static final String INVOME_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payment() {
        String result = restTemplate.getForObject(INVOME_URL + "/payment/consul", String.class);
        return result;
    }
}
