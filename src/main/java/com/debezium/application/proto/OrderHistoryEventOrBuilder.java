// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer_history.proto

package com.debezium.application.proto;

public interface OrderHistoryEventOrBuilder extends
    // @@protoc_insertion_point(interface_extends:application.OrderHistoryEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string order_id = 1;</code>
   * @return The orderId.
   */
  java.lang.String getOrderId();
  /**
   * <code>string order_id = 1;</code>
   * @return The bytes for orderId.
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <code>string order_name = 2;</code>
   * @return The orderName.
   */
  java.lang.String getOrderName();
  /**
   * <code>string order_name = 2;</code>
   * @return The bytes for orderName.
   */
  com.google.protobuf.ByteString
      getOrderNameBytes();

  /**
   * <code>string customer_id = 3;</code>
   * @return The customerId.
   */
  java.lang.String getCustomerId();
  /**
   * <code>string customer_id = 3;</code>
   * @return The bytes for customerId.
   */
  com.google.protobuf.ByteString
      getCustomerIdBytes();

  /**
   * <code>string order_status = 4;</code>
   * @return The orderStatus.
   */
  java.lang.String getOrderStatus();
  /**
   * <code>string order_status = 4;</code>
   * @return The bytes for orderStatus.
   */
  com.google.protobuf.ByteString
      getOrderStatusBytes();

  /**
   * <code>string operation = 5;</code>
   * @return The operation.
   */
  java.lang.String getOperation();
  /**
   * <code>string operation = 5;</code>
   * @return The bytes for operation.
   */
  com.google.protobuf.ByteString
      getOperationBytes();
}
