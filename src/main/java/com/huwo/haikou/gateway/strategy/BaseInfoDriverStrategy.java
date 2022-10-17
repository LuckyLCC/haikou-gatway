package com.huwo.haikou.gateway.strategy;

import com.alibaba.fastjson.JSON;
import com.huwo.haikou.gateway.domain.DuBody;
import com.huwo.haikou.gateway.factory.StrategyFactory;
import com.huwo.haikou.gateway.strategy.istrategy.IStrategy;
import org.springframework.stereotype.Component;

/**
 * @Description: 驾驶员基本信息
 * @Author: liuchang
 * @CreateTime: 2022-10-17  09:40
 */
@Component
public class BaseInfoDriverStrategy extends IStrategy {
    @Override
    protected String handleData(String sourceData, String ipcType) {
        DuBody body = new DuBody();
        body.setIpcType(ipcType);
        body.setChannel("HW");
        body.setData(sourceData);
        return JSON.toJSONString(body);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        StrategyFactory.register("baseInfoDriver", this);
    }
}
