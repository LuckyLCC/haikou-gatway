package com.huwo.haikou.gateway.factory;

import com.huwo.haikou.gateway.strategy.istrategy.IStrategy;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @Author: liuchang
 * @CreateTime: 2022-10-14  14:50
 */

public class StrategyFactory {


    private static final Map<String, IStrategy> strategies = new HashMap<>();


    public static IStrategy getStrategy(String type) {
        if (type == null || type.isEmpty()) {
            throw new IllegalArgumentException("type should not be empty.");
        }
        return strategies.get(type);
    }

    public static  void register(String name,IStrategy iStrategy){
        if (StringUtils.isEmpty(name) || null == iStrategy) {
           return;
        }
        strategies.put(name,iStrategy);

    }



}
