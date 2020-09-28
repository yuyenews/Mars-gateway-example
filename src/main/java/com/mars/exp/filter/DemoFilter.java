package com.mars.exp.filter;

import com.mars.gateway.api.filter.GateFilter;
import com.mars.server.server.request.HttpMarsRequest;
import com.mars.server.server.request.HttpMarsResponse;

public class DemoFilter implements GateFilter {

    public Object doFilter(HttpMarsRequest request, HttpMarsResponse response) {
        System.out.println("过滤器1");
        return SUCCESS;
    }
}
