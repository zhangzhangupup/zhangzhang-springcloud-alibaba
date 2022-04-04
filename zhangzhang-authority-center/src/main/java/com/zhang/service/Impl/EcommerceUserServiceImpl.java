package com.zhang.service.Impl;

import com.zhang.mapper.EcommerceUserMapper;
import com.zhang.pojo.EcommerceUser;
import com.zhang.service.EcommerceUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhangKeChen
 * @Date 2022/3/30 18:23
 */
@Service
public class EcommerceUserServiceImpl implements EcommerceUserService {
    @Autowired
    private EcommerceUserMapper ecommerceUserMapper;
    @Override
    public EcommerceUser queryEcommerceUser(String username) {
        return ecommerceUserMapper.findByUsername(username);
    }
}
