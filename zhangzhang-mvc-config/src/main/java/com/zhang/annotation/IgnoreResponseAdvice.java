package com.zhang.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 忽略统一响应注解定义
 * 以下两个是元注解
 * Target   数组格式表示当前注解可以标识在哪些位置，ElementType.TYPE相当于Java的类，ElementType.METHOD相当于Java类中的方法
 * Retention    表示当前注解被保留的时候，源文件还是运行时
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface IgnoreResponseAdvice {

}
