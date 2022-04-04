package com.zhang.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author zhangKeChen
 * @Date 2022/3/30 17:14
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EcommerceUser {
    private Long id;
    private String username;
    private String password;
    private String extraInfo;
    private Date createTime;
    private Date updateTime;
}
