package com.huwo.haikou.gateway.domain;

import lombok.Data;

/**
 * @Description: TODO
 * @Author: liuchang
 * @CreateTime: 2022-10-16  14:53
 */
@Data
public class DuBody {
    private String ipcType;
    private String channel;
    private String data;
    private String noUpstreamCity;
    private Long firstUpstreamTime;
}
