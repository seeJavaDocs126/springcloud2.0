package com.joyin.cloud.service;

import com.joyin.cloud.model.Payment;

/**
 * @author wd
 * @Classname PaymentService
 * @Description TODO
 * @Date 2021-05-03 9:43
 * @Version V1.0
 */
public interface PaymentService {
    /**
     * 新增
     * @param payment
     * @return
     */
    public int add(Payment payment);

    /**
     * 根据id查询信息
     * @param id
     * @return
     */
    public Payment findById(Long id);
}
