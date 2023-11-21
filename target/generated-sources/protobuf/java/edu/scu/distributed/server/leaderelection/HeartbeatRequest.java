// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leaderElectionService.proto

package edu.scu.distributed.server.leaderelection;

/**
 * Protobuf type {@code HeartbeatRequest}
 */
public final class HeartbeatRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:HeartbeatRequest)
    HeartbeatRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeartbeatRequest.newBuilder() to construct.
  private HeartbeatRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeartbeatRequest() {
    term_ = com.google.protobuf.ByteString.EMPTY;
    memberId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HeartbeatRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.scu.distributed.server.leaderelection.LeaderElectionServiceOuterClass.internal_static_HeartbeatRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.scu.distributed.server.leaderelection.LeaderElectionServiceOuterClass.internal_static_HeartbeatRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.scu.distributed.server.leaderelection.HeartbeatRequest.class, edu.scu.distributed.server.leaderelection.HeartbeatRequest.Builder.class);
  }

  public static final int TERM_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString term_;
  /**
   * <code>bytes term = 1;</code>
   * @return The term.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTerm() {
    return term_;
  }

  public static final int MEMBERID_FIELD_NUMBER = 2;
  private volatile java.lang.Object memberId_;
  /**
   * <code>string memberId = 2;</code>
   * @return The memberId.
   */
  @java.lang.Override
  public java.lang.String getMemberId() {
    java.lang.Object ref = memberId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      memberId_ = s;
      return s;
    }
  }
  /**
   * <code>string memberId = 2;</code>
   * @return The bytes for memberId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMemberIdBytes() {
    java.lang.Object ref = memberId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      memberId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!term_.isEmpty()) {
      output.writeBytes(1, term_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(memberId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, memberId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!term_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, term_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(memberId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, memberId_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof edu.scu.distributed.server.leaderelection.HeartbeatRequest)) {
      return super.equals(obj);
    }
    edu.scu.distributed.server.leaderelection.HeartbeatRequest other = (edu.scu.distributed.server.leaderelection.HeartbeatRequest) obj;

    if (!getTerm()
        .equals(other.getTerm())) return false;
    if (!getMemberId()
        .equals(other.getMemberId())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + TERM_FIELD_NUMBER;
    hash = (53 * hash) + getTerm().hashCode();
    hash = (37 * hash) + MEMBERID_FIELD_NUMBER;
    hash = (53 * hash) + getMemberId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(edu.scu.distributed.server.leaderelection.HeartbeatRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code HeartbeatRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:HeartbeatRequest)
      edu.scu.distributed.server.leaderelection.HeartbeatRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.scu.distributed.server.leaderelection.LeaderElectionServiceOuterClass.internal_static_HeartbeatRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.scu.distributed.server.leaderelection.LeaderElectionServiceOuterClass.internal_static_HeartbeatRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.scu.distributed.server.leaderelection.HeartbeatRequest.class, edu.scu.distributed.server.leaderelection.HeartbeatRequest.Builder.class);
    }

    // Construct using edu.scu.distributed.server.leaderelection.HeartbeatRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      term_ = com.google.protobuf.ByteString.EMPTY;

      memberId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.scu.distributed.server.leaderelection.LeaderElectionServiceOuterClass.internal_static_HeartbeatRequest_descriptor;
    }

    @java.lang.Override
    public edu.scu.distributed.server.leaderelection.HeartbeatRequest getDefaultInstanceForType() {
      return edu.scu.distributed.server.leaderelection.HeartbeatRequest.getDefaultInstance();
    }

    @java.lang.Override
    public edu.scu.distributed.server.leaderelection.HeartbeatRequest build() {
      edu.scu.distributed.server.leaderelection.HeartbeatRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.scu.distributed.server.leaderelection.HeartbeatRequest buildPartial() {
      edu.scu.distributed.server.leaderelection.HeartbeatRequest result = new edu.scu.distributed.server.leaderelection.HeartbeatRequest(this);
      result.term_ = term_;
      result.memberId_ = memberId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof edu.scu.distributed.server.leaderelection.HeartbeatRequest) {
        return mergeFrom((edu.scu.distributed.server.leaderelection.HeartbeatRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(edu.scu.distributed.server.leaderelection.HeartbeatRequest other) {
      if (other == edu.scu.distributed.server.leaderelection.HeartbeatRequest.getDefaultInstance()) return this;
      if (other.getTerm() != com.google.protobuf.ByteString.EMPTY) {
        setTerm(other.getTerm());
      }
      if (!other.getMemberId().isEmpty()) {
        memberId_ = other.memberId_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              term_ = input.readBytes();

              break;
            } // case 10
            case 18: {
              memberId_ = input.readStringRequireUtf8();

              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.google.protobuf.ByteString term_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes term = 1;</code>
     * @return The term.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTerm() {
      return term_;
    }
    /**
     * <code>bytes term = 1;</code>
     * @param value The term to set.
     * @return This builder for chaining.
     */
    public Builder setTerm(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      term_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes term = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTerm() {
      
      term_ = getDefaultInstance().getTerm();
      onChanged();
      return this;
    }

    private java.lang.Object memberId_ = "";
    /**
     * <code>string memberId = 2;</code>
     * @return The memberId.
     */
    public java.lang.String getMemberId() {
      java.lang.Object ref = memberId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        memberId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string memberId = 2;</code>
     * @return The bytes for memberId.
     */
    public com.google.protobuf.ByteString
        getMemberIdBytes() {
      java.lang.Object ref = memberId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        memberId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string memberId = 2;</code>
     * @param value The memberId to set.
     * @return This builder for chaining.
     */
    public Builder setMemberId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      memberId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string memberId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMemberId() {
      
      memberId_ = getDefaultInstance().getMemberId();
      onChanged();
      return this;
    }
    /**
     * <code>string memberId = 2;</code>
     * @param value The bytes for memberId to set.
     * @return This builder for chaining.
     */
    public Builder setMemberIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      memberId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:HeartbeatRequest)
  }

  // @@protoc_insertion_point(class_scope:HeartbeatRequest)
  private static final edu.scu.distributed.server.leaderelection.HeartbeatRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.scu.distributed.server.leaderelection.HeartbeatRequest();
  }

  public static edu.scu.distributed.server.leaderelection.HeartbeatRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeartbeatRequest>
      PARSER = new com.google.protobuf.AbstractParser<HeartbeatRequest>() {
    @java.lang.Override
    public HeartbeatRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<HeartbeatRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeartbeatRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.scu.distributed.server.leaderelection.HeartbeatRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

