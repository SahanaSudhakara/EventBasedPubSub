// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TopicService.proto

package edu.scu.distributed.server.services;

public interface MessageListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MessageList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Message messages = 1;</code>
   */
  java.util.List<edu.scu.distributed.server.services.Message> 
      getMessagesList();
  /**
   * <code>repeated .Message messages = 1;</code>
   */
  edu.scu.distributed.server.services.Message getMessages(int index);
  /**
   * <code>repeated .Message messages = 1;</code>
   */
  int getMessagesCount();
  /**
   * <code>repeated .Message messages = 1;</code>
   */
  java.util.List<? extends edu.scu.distributed.server.services.MessageOrBuilder> 
      getMessagesOrBuilderList();
  /**
   * <code>repeated .Message messages = 1;</code>
   */
  edu.scu.distributed.server.services.MessageOrBuilder getMessagesOrBuilder(
      int index);
}