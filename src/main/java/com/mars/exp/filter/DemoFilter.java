package com.mars.exp.filter;

import com.mars.gateway.api.filter.GateFilter;
import com.mars.iserver.server.impl.MarsHttpExchange;
import com.mars.server.server.request.HttpMarsRequest;
import com.mars.server.server.request.HttpMarsResponse;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class DemoFilter implements GateFilter {

    public Object doFilter(HttpMarsRequest request, HttpMarsResponse response) {
        System.out.println("过滤器1");

        List<String> list = new ArrayList<String>();
        list.add("this is token");
        request.getNativeRequest(MarsHttpExchange.class).getRequestHeaders().put("token",list);

        return SUCCESS;
    }

    public Object doResult(HttpMarsRequest httpMarsRequest, HttpMarsResponse httpMarsResponse, Object o, InputStream inputStream) {
        return SUCCESS;
    }
}
