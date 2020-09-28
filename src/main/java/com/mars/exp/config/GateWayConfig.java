package com.mars.exp.config;

import com.mars.cloud.config.model.CloudConfig;
import com.mars.exp.filter.DemoFilter;
import com.mars.exp.filter.DemoFilterTwo;
import com.mars.gateway.api.filter.GateFilter;
import com.mars.gateway.config.MarsGateWayConfig;

import java.util.ArrayList;
import java.util.List;

public class GateWayConfig extends MarsGateWayConfig {

    @Override
    public CloudConfig getGateWayConfig() {
        CloudConfig cloudConfig = new CloudConfig();
        cloudConfig.setName("gateWay");
        cloudConfig.setRegister("10.211.55.21:2181");
        cloudConfig.setSessionTimeout(10000000L);
        cloudConfig.setTimeOut(1000L);
        return cloudConfig;
    }

    @Override
    public List<GateFilter> getGateFilter() {
        List<GateFilter> list = new ArrayList<GateFilter>();
        list.add(new DemoFilter());
        list.add(new DemoFilterTwo());
        return list;
    }
}
