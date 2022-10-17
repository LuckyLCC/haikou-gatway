package com.huwo.haikou.gateway.domain;

/**
 * @Description: TODO
 * @Author: liuchang
 * @CreateTime: 2022-10-17  09:10
 */
public enum TableEnum {

    BASE_INFO_COMPANY_FARE("base_info_company_fare", "baseInfoCompanyFare"),
    BASE_INFO_DRIVER("base_info_driver", "baseInfoVehicle"),
    BASE_INFO_VEHICLE_INSURANCE("base_info_vehicle_insurance", "baseInfoVehicleInsurance"),
    BASE_INFO_VEHICLE_TOTAL_MILE("base_info_vehicle_total_mile", "baseInfoVehicleTotalMile"),
    BASE_INFO_VEHICLE("base_info_vehicle", "baseInfoVehicle"),
    BASE_INFO_DRIVER_EDUCATE("base_info_driver_educate", "baseInfoDriverEducate"),
    BASE_INFO_DRIVER_STAT("base_info_driver_stat", "baseInfoDriverStat"),
    BASE_INFO_PASSENGER("base_info_passenger", "baseInfoPassenger"),
    ORDER_CREATE("order_create", "orderCreate"),
    ORDER_CANCEL("order_cancel", "orderCancel"),
    ORDER_MATCH("order_match", "orderMatch"),
    OPERATE_LOGIN("operate_login", "operateLogin"),
    OPERATE_LOGOUT("operate_logout", "operateLogout"),
    OPERATE_DEPART("order_operate_depart", "operateDepart"),
    OPERATE_ARRIVE("order_operate_arrive", "operateArrive"),
    OPERATE_PAY("order_operate_pay", "operatePay"),
    POSITION_DRIVER("position_driver", "positionDriver"),
    POSITION_VEHICLE("position_vehicle", "positionVehicle"),
    RATED_PASSENGER("rated_passenger", "ratedPassenger"),
    RATED_PASSENGER_COMPLAINT("rated_passenger_complaint", "ratedPassengerComplaint"),
    RATED_DRIVER_PUNISH("rated_driver_punish", "ratedDriverPunish"),
    RATED_DRIVER("rated_driver", "ratedDriver");


    private final String tableName;
    private final String ipcType;

    TableEnum(String tableName, String ipcType) {
        this.tableName = tableName;
        this.ipcType = ipcType;
    }

    public static String getIpcTypeByTableName(String tableName) {
        TableEnum ipcTypeEnum = get(tableName);
        return null != ipcTypeEnum ? ipcTypeEnum.ipcType : null;
    }

    public static TableEnum get(String tableName) {
        TableEnum[] var1 = values();
        int var2 = var1.length;

        for(int var3 = 0; var3 < var2; ++var3) {
            TableEnum ipcTypeEnum = var1[var3];
            if (tableName.equals(ipcTypeEnum.tableName)) {
                return ipcTypeEnum;
            }
        }

        return null;
    }

    public String getTableName() {
        return tableName;
    }

    public String getIpcType() {
        return ipcType;
    }
}
