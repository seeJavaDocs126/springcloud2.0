package com.joyin.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.UUID;

/**
 * @author wd
 * @Classname ConsulController
 * @Description TODO
 * @Date 2021-05-04 22:54
 * @Version V1.0
 */
@RestController
public class ConsumerConsulController {
    //consul-provider-payment
    public static final String INVOME_URL = "http://consul-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/consul")
    public String payment() {
        String result = restTemplate.getForObject(INVOME_URL + "/payment/consul", String.class);
        return result;
    }
}
