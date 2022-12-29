package com.huwo.haikou.gateway;

import com.alibaba.fastjson.JSONObject;
import com.huwo.haikou.gateway.strategy.istrategy.IStrategy;
import com.huwo.haikou.gateway.factory.StrategyFactory;
import com.huwo.haikou.gateway.utils.CanalConfig;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

@SpringBootApplication
@Slf4j
public class HaikouGatwayApplication {

    static ScheduledExecutorService service = Executors.newScheduledThreadPool(1);

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(HaikouGatwayApplication.class, args);

        CanalConfig canalConfig = new CanalConfig();

        service.execute(canalConfig);

        while (true) {
            Thread.sleep(5000);

            ConcurrentLinkedQueue<String> clq = CanalConfig.getClq();
            String poll = clq.poll();
            System.out.println("取出的数据为" + poll);


            if (StringUtils.isEmpty(poll)) {
                continue;
            }

            JSONObject jsonObject = JSONObject.parseObject(poll);
            if (jsonObject.isEmpty()) {
                continue;
            }

            String ipcType = (String) jsonObject.get("ipcType");
            IStrategy strategy = StrategyFactory.getStrategy(ipcType);
            if (strategy == null) {
                log.error("沒找到相应的策略模式,ipcType为{},数据为{},",ipcType,poll);
                continue;
            }
            strategy.handleAndSendData(poll, ipcType);
            System.out.println(Thread.currentThread().getName() + "-----------------");
        }
    }

}
