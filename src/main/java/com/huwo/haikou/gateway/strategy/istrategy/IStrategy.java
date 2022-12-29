package com.huwo.haikou.gateway.strategy.istrategy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.huwo.haikou.gateway.domain.DuBody;
import com.huwo.haikou.gateway.utils.KafkaUtils;
import org.springframework.beans.factory.InitializingBean;

public abstract class IStrategy implements InitializingBean {

    //数据上报
    public void handleAndSendData(String sourceData, String ipcType) {
        //统一数据处理
        JSONObject jsonObject = JSONObject.parseObject(sourceData);
        jsonObject.put("updateTime", jsonObject.get("updateTimeBiz"));


        //封装数据
        DuBody body = new DuBody();
        body.setIpcType(ipcType);
        body.setChannel("HW-DB");
        body.setData(jsonObject.toJSONString());

        //处理数据
        String message = handleData(JSON.toJSONString(body));

        //发送kafka
        KafkaUtils.sendMessage(message, ipcType);
    }

    /**
     *
     * @Description:  数据进一步组装，模板模式接口，利于后期拓展
     * @Author: liuchang
     * @Date: 2022-10-17 12:26
     * @Param: [sourceData]
     * @Return: java.lang.String
     **/
    protected String handleData(String duBodyToString) {
        return duBodyToString;
    }
}
