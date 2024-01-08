package com.debezium.application.service;

import com.debezium.application.entity.OrderHistory;
import com.debezium.application.proto.OrderHistoryEvent;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.debezium.data.Envelope.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class CustomerService {

    @Autowired
    KafkaTemplate producerTemplate;

    public void replicateData(Map<String, Object> orderHistoryData, Operation operation) {
        final ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        final OrderHistory orderHistory = mapper.convertValue(orderHistoryData, OrderHistory.class);

        OrderHistoryEvent orderHistoryEvent=OrderHistoryEvent.newBuilder()
                .setCustomerId(orderHistory.getCustomer_id())
                .setOrderId(orderHistory.getOrder_id())
                .setOrderName(orderHistory.getOrder_name())
                .setOrderStatus(orderHistory.getOrder_status())
                .setOperation(operation.name()).build();

        producerTemplate.send("ORDER_HISTORY_TRACKING",orderHistoryEvent);

    }
}