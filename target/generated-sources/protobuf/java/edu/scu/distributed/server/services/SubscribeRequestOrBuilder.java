// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TopicService.proto

package edu.scu.distributed.server.services;

public interface SubscribeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SubscribeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string ipAddress = 1;</code>
   * @return The ipAddress.
   */
  java.lang.String getIpAddress();
  /**
   * <code>string ipAddress = 1;</code>
   * @return The bytes for ipAddress.
   */
  com.google.protobuf.ByteString
      getIpAddressBytes();

  /**
   * <code>string port = 2;</code>
   * @return The port.
   */
  java.lang.String getPort();
  /**
   * <code>string port = 2;</code>
   * @return The bytes for port.
   */
  com.google.protobuf.ByteString
      getPortBytes();

  /**
   * <code>string topic = 3;</code>
   * @return The topic.
   */
  java.lang.String getTopic();
  /**
   * <code>string topic = 3;</code>
   * @return The bytes for topic.
   */
  com.google.protobuf.ByteString
      getTopicBytes();
}
