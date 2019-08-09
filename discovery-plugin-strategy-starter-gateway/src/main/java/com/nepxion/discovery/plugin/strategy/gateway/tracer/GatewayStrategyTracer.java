package com.nepxion.discovery.plugin.strategy.gateway.tracer;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import org.springframework.web.server.ServerWebExchange;

public interface GatewayStrategyTracer {
    void trace(ServerWebExchange exchange);

    void release(ServerWebExchange exchange);
}