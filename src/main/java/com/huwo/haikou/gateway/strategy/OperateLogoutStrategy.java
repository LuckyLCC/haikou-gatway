package com.huwo.haikou.gateway.strategy;

import com.alibaba.fastjson.JSON;
import com.huwo.haikou.gateway.domain.DuBody;
import com.huwo.haikou.gateway.factory.StrategyFactory;
import com.huwo.haikou.gateway.strategy.istrategy.IStrategy;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author: liuchang
 * @CreateTime: 2022-10-17  10:28
 */
@Component
public class OperateLogoutStrategy extends IStrategy {


    @Override
    public void afterPropertiesSet() throws Exception {
        StrategyFactory.register("operateLogout", this);
    }
}
