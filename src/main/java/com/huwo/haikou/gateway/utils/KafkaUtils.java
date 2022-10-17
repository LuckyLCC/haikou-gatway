package com.huwo.haikou.gateway.utils;

import com.huwo.haikou.gateway.domain.IPCType2TopicEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @Description: TODO
 * @Author: liuchang
 * @CreateTime: 2022-10-14  16:26
 */
@Component
@Slf4j
public class KafkaUtils {

    @Autowired
    private static KafkaTemplate kafkaTemplate;

    @Autowired
    public void setService(KafkaTemplate kafkaTemplate)  {
        KafkaUtils.kafkaTemplate = kafkaTemplate;
    }

    public static void sendMessage(String message, String ipcType) {
        log.info("发送kafka数据为{},topic为{}",message,IPCType2TopicEnum.getTopicByType(ipcType));
        kafkaTemplate.send(IPCType2TopicEnum.getTopicByType(ipcType), message);

    }


}
