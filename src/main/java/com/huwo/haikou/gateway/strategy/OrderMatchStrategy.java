package com.huwo.haikou.gateway.strategy;

import com.alibaba.fastjson.JSON;
import com.huwo.haikou.gateway.domain.DuBody;
import com.huwo.haikou.gateway.factory.StrategyFactory;
import com.huwo.haikou.gateway.strategy.istrategy.IStrategy;
import org.springframework.stereotype.Component;

/**
 * @Description: 订单匹配接口
 * @Author: liuchang
 * @CreateTime: 2022-10-17  10:09
 */
@Component
public class OrderMatchStrategy extends IStrategy {


    @Override
    public void afterPropertiesSet() throws Exception {
        StrategyFactory.register("orderMatch", this);
    }
}
