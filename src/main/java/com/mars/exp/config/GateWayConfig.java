package com.mars.exp.config;

import com.mars.cloud.balanced.BalancedCalc;
import com.mars.cloud.config.model.CloudConfig;
import com.mars.cloud.request.balanced.impl.BalancedCalcPolling;
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
        cloudConfig.setContagions("http://127.0.0.1:8088");
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

    @Override
    public BalancedCalc getBalancedCalc() {
        return new BalancedCalcPolling();
    }

    /**
     * 每次从请求的数据中读取多少字节
     * 默认1M
     * @return
     */
    @Override
    public int readSize() {
        return super.readSize();
    }
}
