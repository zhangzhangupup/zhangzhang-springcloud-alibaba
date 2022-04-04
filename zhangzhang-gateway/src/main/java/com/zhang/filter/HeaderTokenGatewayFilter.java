package com.zhang.filter;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * <h1>HTTP 请求头部携带 Token 验证过滤器</h1>
 * 局部过滤器
 * 第一步  实现GatewayFilter, Ordered编写过滤方式
 * 第二步  创建factory。新建factory包，继承AbstractGatewayFilterFactory<Object>，重写方法，将自定义filter返回即可
 * */
public class HeaderTokenGatewayFilter implements GatewayFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

        // 从 HTTP Header 中寻找 key 为 token, value 为 imooc 的键值对
        String name = exchange.getRequest().getHeaders().getFirst("token");
        if ("ZhangKeChen".equals(name)) {
            return chain.filter(exchange);
        }

        // 标记此次请求没有权限, 并结束这次请求
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        return exchange.getResponse().setComplete();
    }

    @Override
    public int getOrder() {
//        优先级，数字越大优先越低
        return HIGHEST_PRECEDENCE + 2;
    }
}
