// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leaderElectionService.proto

package edu.scu.distributed.server.leaderelection;

/**
 * Protobuf type {@code VoteResponse}
 */
public final class VoteResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:VoteResponse)
    VoteResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VoteResponse.newBuilder() to construct.
  private VoteResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VoteResponse() {
    candidateId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VoteResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return edu.scu.distributed.server.leaderelection.LeaderElectionServiceOuterClass.internal_static_VoteResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return edu.scu.distributed.server.leaderelection.LeaderElectionServiceOuterClass.internal_static_VoteResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            edu.scu.distributed.server.leaderelection.VoteResponse.class, edu.scu.distributed.server.leaderelection.VoteResponse.Builder.class);
  }

  public static final int GRANTED_FIELD_NUMBER = 1;
  private boolean granted_;
  /**
   * <code>bool granted = 1;</code>
   * @return The granted.
   */
  @java.lang.Override
  public boolean getGranted() {
    return granted_;
  }

  public static final int CANDIDATEID_FIELD_NUMBER = 2;
  private volatile java.lang.Object candidateId_;
  /**
   * <code>string candidateId = 2;</code>
   * @return The candidateId.
   */
  @java.lang.Override
  public java.lang.String getCandidateId() {
    java.lang.Object ref = candidateId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      candidateId_ = s;
      return s;
    }
  }
  /**
   * <code>string candidateId = 2;</code>
   * @return The bytes for candidateId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCandidateIdBytes() {
    java.lang.Object ref = candidateId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      candidateId_ = b;
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
    if (granted_ != false) {
      output.writeBool(1, granted_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(candidateId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, candidateId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (granted_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, granted_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(candidateId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, candidateId_);
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
    if (!(obj instanceof edu.scu.distributed.server.leaderelection.VoteResponse)) {
      return super.equals(obj);
    }
    edu.scu.distributed.server.leaderelection.VoteResponse other = (edu.scu.distributed.server.leaderelection.VoteResponse) obj;

    if (getGranted()
        != other.getGranted()) return false;
    if (!getCandidateId()
        .equals(other.getCandidateId())) return false;
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
    hash = (37 * hash) + GRANTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getGranted());
    hash = (37 * hash) + CANDIDATEID_FIELD_NUMBER;
    hash = (53 * hash) + getCandidateId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static edu.scu.distributed.server.leaderelection.VoteResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.scu.distributed.server.leaderelection.VoteResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.scu.distributed.server.leaderelection.VoteResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.scu.distributed.server.leaderelection.VoteResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.scu.distributed.server.leaderelection.VoteResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static edu.scu.distributed.server.leaderelection.VoteResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static edu.scu.distributed.server.leaderelection.VoteResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.scu.distributed.server.leaderelection.VoteResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.scu.distributed.server.leaderelection.VoteResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static edu.scu.distributed.server.leaderelection.VoteResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static edu.scu.distributed.server.leaderelection.VoteResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static edu.scu.distributed.server.leaderelection.VoteResponse parseFrom(
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
  public static Builder newBuilder(edu.scu.distributed.server.leaderelection.VoteResponse prototype) {
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
   * Protobuf type {@code VoteResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:VoteResponse)
      edu.scu.distributed.server.leaderelection.VoteResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return edu.scu.distributed.server.leaderelection.LeaderElectionServiceOuterClass.internal_static_VoteResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return edu.scu.distributed.server.leaderelection.LeaderElectionServiceOuterClass.internal_static_VoteResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              edu.scu.distributed.server.leaderelection.VoteResponse.class, edu.scu.distributed.server.leaderelection.VoteResponse.Builder.class);
    }

    // Construct using edu.scu.distributed.server.leaderelection.VoteResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      granted_ = false;

      candidateId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return edu.scu.distributed.server.leaderelection.LeaderElectionServiceOuterClass.internal_static_VoteResponse_descriptor;
    }

    @java.lang.Override
    public edu.scu.distributed.server.leaderelection.VoteResponse getDefaultInstanceForType() {
      return edu.scu.distributed.server.leaderelection.VoteResponse.getDefaultInstance();
    }

    @java.lang.Override
    public edu.scu.distributed.server.leaderelection.VoteResponse build() {
      edu.scu.distributed.server.leaderelection.VoteResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public edu.scu.distributed.server.leaderelection.VoteResponse buildPartial() {
      edu.scu.distributed.server.leaderelection.VoteResponse result = new edu.scu.distributed.server.leaderelection.VoteResponse(this);
      result.granted_ = granted_;
      result.candidateId_ = candidateId_;
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
      if (other instanceof edu.scu.distributed.server.leaderelection.VoteResponse) {
        return mergeFrom((edu.scu.distributed.server.leaderelection.VoteResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(edu.scu.distributed.server.leaderelection.VoteResponse other) {
      if (other == edu.scu.distributed.server.leaderelection.VoteResponse.getDefaultInstance()) return this;
      if (other.getGranted() != false) {
        setGranted(other.getGranted());
      }
      if (!other.getCandidateId().isEmpty()) {
        candidateId_ = other.candidateId_;
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
            case 8: {
              granted_ = input.readBool();

              break;
            } // case 8
            case 18: {
              candidateId_ = input.readStringRequireUtf8();

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

    private boolean granted_ ;
    /**
     * <code>bool granted = 1;</code>
     * @return The granted.
     */
    @java.lang.Override
    public boolean getGranted() {
      return granted_;
    }
    /**
     * <code>bool granted = 1;</code>
     * @param value The granted to set.
     * @return This builder for chaining.
     */
    public Builder setGranted(boolean value) {
      
      granted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool granted = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearGranted() {
      
      granted_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object candidateId_ = "";
    /**
     * <code>string candidateId = 2;</code>
     * @return The candidateId.
     */
    public java.lang.String getCandidateId() {
      java.lang.Object ref = candidateId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        candidateId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string candidateId = 2;</code>
     * @return The bytes for candidateId.
     */
    public com.google.protobuf.ByteString
        getCandidateIdBytes() {
      java.lang.Object ref = candidateId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        candidateId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string candidateId = 2;</code>
     * @param value The candidateId to set.
     * @return This builder for chaining.
     */
    public Builder setCandidateId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      candidateId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string candidateId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCandidateId() {
      
      candidateId_ = getDefaultInstance().getCandidateId();
      onChanged();
      return this;
    }
    /**
     * <code>string candidateId = 2;</code>
     * @param value The bytes for candidateId to set.
     * @return This builder for chaining.
     */
    public Builder setCandidateIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      candidateId_ = value;
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


    // @@protoc_insertion_point(builder_scope:VoteResponse)
  }

  // @@protoc_insertion_point(class_scope:VoteResponse)
  private static final edu.scu.distributed.server.leaderelection.VoteResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new edu.scu.distributed.server.leaderelection.VoteResponse();
  }

  public static edu.scu.distributed.server.leaderelection.VoteResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VoteResponse>
      PARSER = new com.google.protobuf.AbstractParser<VoteResponse>() {
    @java.lang.Override
    public VoteResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<VoteResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VoteResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public edu.scu.distributed.server.leaderelection.VoteResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

