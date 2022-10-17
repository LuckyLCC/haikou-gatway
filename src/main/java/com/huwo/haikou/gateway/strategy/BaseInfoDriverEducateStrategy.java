package com.huwo.haikou.gateway.strategy;

import com.alibaba.fastjson.JSON;
import com.huwo.haikou.gateway.domain.DuBody;
import com.huwo.haikou.gateway.factory.StrategyFactory;
import com.huwo.haikou.gateway.strategy.istrategy.IStrategy;
import org.springframework.stereotype.Component;

/**
 * @Description: 网约车驾驶员培训信息接口
 * @Author: liuchang
 * @CreateTime: 2022-10-17  09:41
 */
@Component
public class BaseInfoDriverEducateStrategy extends IStrategy {


    @Override
    public void afterPropertiesSet() throws Exception {
        StrategyFactory.register("baseInfoDriverEducate", this);
    }
}
