package com.joyin.cloud.controller;

import com.joyin.cloud.model.CommonResult;
import com.joyin.cloud.model.Payment;
import com.joyin.cloud.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;

/**
 * @author wd
 * @Classname PaymnetController
 * @Description TODO
 * @Date 2021-05-03 9:56
 * @Version V1.0
 */
@RestController
public class PaymnetController {

    @Value("${server.port}")
    private String serverPort;

    @Resource
    private PaymentService paymentService;
    final Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping(value = "/payment/add")
    public CommonResult<Integer> add(@RequestBody Payment payment){
        if (payment.getModuleid() == null) {
            return new CommonResult<Integer>(444, "serverPort:" + serverPort + "|->插入数据库失败", null);
        }
        int result = paymentService.add(payment);
        logger.info("*****插入结果：" + result);
        if (result > 0) {  //插入成功
            return new CommonResult<>(200, "serverPort:" + serverPort + "|->插入数据库成功", result);
        } else {
            return new CommonResult<Integer>(444, "serverPort:" + serverPort + "|->插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{dbid}")
    public CommonResult<Payment> getPaymentById(@PathVariable("dbid") Long dbid) {
        Payment payment = paymentService.findById(dbid);
        logger.info("*****查询结果：" + payment);
        if (payment != null) {  //说明有数据，能查询成功
            return new CommonResult<>(200, "serverPort:" + serverPort + "|->查询成功", payment);
        } else {
            return new CommonResult<Payment>(444, "serverPort:" + serverPort + "|->没有对应记录，查询ID：" + dbid, null);
        }
    }

}
