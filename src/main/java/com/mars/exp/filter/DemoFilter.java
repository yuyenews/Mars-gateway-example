package com.mars.exp.filter;

import com.mars.gateway.common.filter.GateFilter;
import com.mars.aio.server.impl.MarsHttpExchange;
import com.mars.server.server.request.HttpMarsRequest;
import com.mars.server.server.request.HttpMarsResponse;

import java.io.InputStream;

public class DemoFilter implements GateFilter {

    public Object doFilter(HttpMarsRequest request, HttpMarsResponse response) {
        System.out.println("过滤器1");

        request.getNativeRequest(MarsHttpExchange.class).getRequestHeaders().put("token","this is token");

        return SUCCESS;
    }

    public Object doResult(HttpMarsRequest httpMarsRequest, HttpMarsResponse httpMarsResponse, Object o, InputStream inputStream) {
        return SUCCESS;
    }
}
