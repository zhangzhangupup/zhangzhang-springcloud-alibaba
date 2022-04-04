package com.zhang.mapper;

import com.zhang.pojo.EcommerceUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author zhangKeChen
 * @Date 2022/3/30 17:42
 */
@Mapper
public interface EcommerceUserMapper {
    /**
     * 根据username查询用户信息
     * @param username
     * @return
     */
    EcommerceUser findByUsername(@Param("username") String username);

    EcommerceUser findByUsernameAndPassword(@Param("username")String username,@Param("password") String password);

    int save(@Param("username")String username,@Param("password") String password,@Param("extraInfo") String extraInfo);
}
