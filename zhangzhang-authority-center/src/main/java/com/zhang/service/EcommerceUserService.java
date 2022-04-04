package com.zhang.service;

import com.zhang.pojo.EcommerceUser;


/**
 * @Author zhangKeChen
 * @Date 2022/3/30 18:22
 */
public interface EcommerceUserService {
    /**
     * 根据username查询用户信息
     * @param username
     * @return
     */
    EcommerceUser queryEcommerceUser(String username);
}
