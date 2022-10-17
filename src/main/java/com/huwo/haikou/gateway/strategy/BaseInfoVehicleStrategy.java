package com.huwo.haikou.gateway.strategy;

import com.alibaba.fastjson.JSON;
import com.huwo.haikou.gateway.domain.DuBody;
import com.huwo.haikou.gateway.factory.StrategyFactory;
import com.huwo.haikou.gateway.strategy.istrategy.IStrategy;
import org.springframework.stereotype.Component;

/**
 * @Description: 车辆基本信息
 * @Author: liuchang
 * @CreateTime: 2022-10-14  14:55
 */


@Component
public class BaseInfoVehicleStrategy extends IStrategy {




    @Override
    public void afterPropertiesSet() throws Exception {
        StrategyFactory.register("baseInfoVehicle", this);
    }
}
