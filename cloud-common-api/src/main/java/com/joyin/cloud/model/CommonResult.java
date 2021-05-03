package com.joyin.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import java.io.Serializable;

/**
 * @author wd
 * @Classname CommonResult
 * @Description TODO
 * @Date 2021-05-02 15:05
 * @Version V1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class CommonResult<T> implements Serializable {
    private Integer code;
    private String msg;
    private T data;
}
