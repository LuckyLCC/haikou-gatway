package com.huwo.haikou.gateway.strategy;

import com.alibaba.fastjson.JSON;
import com.huwo.haikou.gateway.domain.DuBody;
import com.huwo.haikou.gateway.factory.StrategyFactory;
import com.huwo.haikou.gateway.strategy.istrategy.IStrategy;
import org.springframework.stereotype.Component;

/**
 * @Description: 车辆保险信息
 * @Author: liuchang
 * @CreateTime: 2022-10-17  09:37
 */
@Component
public class BaseInfoVehicleInsuranceStrategy extends IStrategy {


    @Override
    public void afterPropertiesSet() throws Exception {
        StrategyFactory.register("baseInfoVehicleInsurance", this);
    }
}
