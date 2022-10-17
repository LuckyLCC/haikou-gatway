package com.huwo.haikou.gateway.strategy;

import com.alibaba.fastjson.JSON;
import com.huwo.haikou.gateway.domain.DuBody;
import com.huwo.haikou.gateway.factory.StrategyFactory;
import com.huwo.haikou.gateway.strategy.istrategy.IStrategy;
import org.springframework.stereotype.Component;

/**
 * @Description: 网约车驾驶员统计信息接口
 * @Author: liuchang
 * @CreateTime: 2022-10-17  10:05
 */
@Component
public class BaseInfoDriverStatStrategy extends IStrategy {


    @Override
    public void afterPropertiesSet() throws Exception {
        StrategyFactory.register("baseInfoDriverStat", this);
    }
}
