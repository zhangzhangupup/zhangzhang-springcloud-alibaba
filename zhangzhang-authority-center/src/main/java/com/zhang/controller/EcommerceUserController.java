package com.zhang.controller;

import com.zhang.pojo.EcommerceUser;
import com.zhang.service.EcommerceUserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author zhangKeChen
 * @Date 2022/3/30 18:44
 */
@RestController
@RequestMapping("/test")
public class EcommerceUserController {
    @Autowired
    private EcommerceUserService ecommerceUserService;

    @GetMapping("/queryEcommerceUser")
    public EcommerceUser queryEcommerceUser(@RequestParam("username") String username) {
        return ecommerceUserService.queryEcommerceUser(username);
    }
}
