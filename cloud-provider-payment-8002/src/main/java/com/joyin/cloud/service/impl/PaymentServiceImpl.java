package com.joyin.cloud.service.impl;

import com.joyin.cloud.dao.PaymentDao;
import com.joyin.cloud.model.Payment;
import com.joyin.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author wd
 * @Classname PaymentServiceImpl
 * @Description TODO
 * @Date 2021-05-03 9:44
 * @Version V1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int add(Payment payment) {
        return paymentDao.add(payment);
    }

    @Override
    public Payment findById(Long id) {
        return paymentDao.findById(id);
    }
}
