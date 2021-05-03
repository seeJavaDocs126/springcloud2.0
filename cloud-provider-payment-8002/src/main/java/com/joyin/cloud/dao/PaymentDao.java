package com.joyin.cloud.dao;

import com.joyin.cloud.model.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author wd
 * @Classname PaymentDao
 * @Description TODO
 * @Date 2021-05-03 9:29
 * @Version V1.0
 */
@Mapper
public interface PaymentDao {

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
