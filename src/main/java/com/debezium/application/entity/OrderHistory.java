package com.debezium.application.entity;

import lombok.Data;

@Data
public class OrderHistory {
    private String order_id;
    private String order_name;
    private String customer_id;
    private String order_status;
}