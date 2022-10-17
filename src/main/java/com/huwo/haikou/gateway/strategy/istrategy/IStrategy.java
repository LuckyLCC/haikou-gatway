package com.huwo.haikou.gateway.strategy.istrategy;

import com.huwo.haikou.gateway.utils.KafkaUtils;
import org.springframework.beans.factory.InitializingBean;

public abstract class IStrategy implements InitializingBean {

    //数据上报
    public void handleAndSendData(String sourceData, String ipcType) {
        //处理数据
        String s = handleData(sourceData,ipcType);

        //发送kafka
        KafkaUtils.sendMessage(s,ipcType);
    }

    //数据进一步组装
    protected abstract String handleData(String sourceData, String ipcType);
}
