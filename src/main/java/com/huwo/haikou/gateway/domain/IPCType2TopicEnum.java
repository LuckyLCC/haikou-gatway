package com.huwo.haikou.gateway.domain;

/**
 * @Description: TODO
 * @Author: liuchang
 * @CreateTime: 2022-10-16  15:28
 */
public enum IPCType2TopicEnum {


    COMPANY_FARA("baseInfoCompanyFare", "lx-datahospice.basic.quality"),
    BASE_INFO_DRIVER("baseInfoDriver", "lx-datahospice.basic.quality"),
    BASE_INFO_VEHICLE_INSURANCE("baseInfoVehicleInsurance", "lx-datahospice.basic.quality"),
    BASE_INFO_VEHICLE_TOTAL_MILE( "baseInfoVehicleTotalMile","lx-datahospice.basic.quality"),
    BASE_INFO_VEHICLE("baseInfoVehicle","lx-datahospice.basic.quality"),
    BASE_INFO_DRIVER_EDUCATE("baseInfoDriverEducate","lx-datahospice.basic.quality"),
    BASE_INFO_DRIVER_STAT("baseInfoDriverStat","lx-datahospice.basic.quality"),
    BASE_INFO_PASSENGER("baseInfoPassenger","lx-datahospice.basic.quality"),
    RATED_PASSENGER("ratedPassenger","lx-datahospice.basic.quality"),
    RATED_PASSENGER_COMPLAINT("ratedPassengerComplaint","lx-datahospice.basic.quality"),
    RATED_DRIVER_PUNISH("ratedDriverPunish","lx-datahospice.basic.quality"),
    RATED_DRIVER("ratedDriver","lx-datahospice.basic.quality"),

    ORDER_CREATE("orderCreate","lx-datahospice.order.operate"),
    ORDER_MATCH("orderMatch","lx-datahospice.order.operate"),
    ORDER_CANCEL("orderCancel","lx-datahospice.order.operate"),
    OPERATE_LOGIN("operateLogin","lx-datahospice.order.operate"),
    OPERATE_LOGOUT("operateLogout","lx-datahospice.order.operate"),
    OPERATE_DEPART("operateDepart","lx-datahospice.order.operate"),
    OPERATE_ARRIVE("operateArrive","lx-datahospice.order.operate"),
    OPERATE_PAY("operatePay","lx-datahospice.order.operate"),


    POSITION_DRIVER("positionDriver","lx-datahospice.position"),
    POSITION_VEHICLE("positionVehicle","lx-datahospice.position");





    private final String ipcType;
    private final String topic;


    IPCType2TopicEnum(String ipcType, String topic) {
        this.ipcType = ipcType;
        this.topic = topic;
    }

    public static String getTopicByType(String type) {
        IPCType2TopicEnum ipcTypeEnum = get(type);
        return null != ipcTypeEnum ? ipcTypeEnum.topic : null;
    }

    public static IPCType2TopicEnum get(String type) {
        IPCType2TopicEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            IPCType2TopicEnum ipcTypeEnum = var1[var3];
            if (type.equals(ipcTypeEnum.ipcType)) {
                return ipcTypeEnum;
            }
        }

        return null;
    }

    public String getIpcType() {
        return this.ipcType;
    }

    public String getTopic() {
        return this.topic;
    }


}
