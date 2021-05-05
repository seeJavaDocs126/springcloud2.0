package com.joyin.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.UUID;

/**
 * @author wd
 * @Classname ZookeeperController
 * @Description TODO
 * @Date 2021-05-04 20:57
 * @Version V1.0
 */
@RestController
public class ZookeeperController {
    @Value("${server.port}")
    private String serverPort;
    final Logger logger = LoggerFactory.getLogger(getClass());

    @GetMapping(value = "/payment/zk")
    public String paymentzk() {
        String s = "springcloud with zookeeper:" + serverPort + "\t" + UUID.randomUUID().toString();
        logger.info(s);
        return s;
    }
}
