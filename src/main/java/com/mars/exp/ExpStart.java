package com.mars.exp;

import com.mars.exp.config.GateWayConfig;
import com.mars.gateway.starter.StartGateWay;

public class ExpStart {

    public static void main(String[] args) {
        StartGateWay.start(ExpStart.class, new GateWayConfig());
    }
}
