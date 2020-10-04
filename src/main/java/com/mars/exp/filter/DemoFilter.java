package com.mars.exp.filter;

import com.mars.gateway.api.filter.GateFilter;
import com.mars.server.server.request.HttpMarsRequest;
import com.mars.server.server.request.HttpMarsResponse;

import java.util.ArrayList;
import java.util.List;

public class DemoFilter implements GateFilter {

    public Object doFilter(HttpMarsRequest request, HttpMarsResponse response) {
        System.out.println("过滤器1");

        List<String> list = new ArrayList<String>();
        list.add("this is token");
        request.getHttpExchange().getRequestHeaders().put("token",list);

        return SUCCESS;
    }
}
