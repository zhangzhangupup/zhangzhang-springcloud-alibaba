package com.zhang.result;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author zhangKeChen
 * @Date 2022/3/29 10:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class resultResponse<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;

    public resultResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
