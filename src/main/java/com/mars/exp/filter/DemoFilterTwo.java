package com.mars.exp.filter;

import com.mars.gateway.api.filter.GateFilter;
import com.mars.server.server.request.HttpMarsRequest;
import com.mars.server.server.request.HttpMarsResponse;

import java.util.HashMap;
import java.util.Map;

public class DemoFilterTwo implements GateFilter {

    public Object doFilter(HttpMarsRequest request, HttpMarsResponse response) {
        System.out.println("过滤器2");
        Map map = new HashMap();
        map.put("code",500);
        map.put("msg","不让你过");
        return map;
    }
}
