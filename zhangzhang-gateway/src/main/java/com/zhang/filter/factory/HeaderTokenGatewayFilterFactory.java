package com.zhang.filter.factory;

import com.zhang.filter.HeaderTokenGatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

/**
 * HeaderTokenGatewayFilterFactory
 * GatewayFilterFactory后缀是固定的
 * 自定义的filter的名称是除过GatewayFilterFactory的（HeaderToken）
 */
@Component
public class HeaderTokenGatewayFilterFactory
        extends AbstractGatewayFilterFactory<Object> {

    @Override
    public GatewayFilter apply(Object config) {
        return new HeaderTokenGatewayFilter();
    }
}
