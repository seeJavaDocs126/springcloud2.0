package com.joyin.cloud.controller;

import com.joyin.cloud.model.CommonResult;
import com.joyin.cloud.model.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import javax.annotation.Resource;

/**
 * @author wd
 * @Classname PaymentConsumerController
 * @Description TODO
 * @Date 2021-05-03 13:03
 * @Version V1.0
 */
@RestController
public class PaymentConsumerController {

    private final String REST_RUL = "http://localhost:8001";
    @Resource
    private RestTemplate restTemplate;
    final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping(value = "consumer/payment/add")
    public CommonResult<Integer> add(Payment payment){
        logger.info("消费端9080...add...start...payment:"+payment);
        return restTemplate.postForObject(REST_RUL+"//payment/add",payment,CommonResult.class);
    }

    @GetMapping(value = "consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        logger.info("消费端9080...get...start...id:"+id);
        return restTemplate.getForObject(REST_RUL+"/payment/get/"+id,CommonResult.class);
    }

}
