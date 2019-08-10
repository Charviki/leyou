package com.leyou.order.enums;

public enum  OrderStatusEnum {
    UN_PAY(1,"未付款"),
    PAID(2,"已付款"),
    DELIVERED(3,"已发货"),
    SUCCESS(4,"已确认，未评价"),
    CLOSED(5,"交易关闭"),
    RATED(6,"已评价"),
    ;
    private int code;
    private String desc;

    OrderStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int value(){
        return this.code;
    }

}
