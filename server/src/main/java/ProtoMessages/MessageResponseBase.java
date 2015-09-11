// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageResponse.proto

package ProtoMessages;

public final class MessageResponseBase {
  private MessageResponseBase() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface MessageResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MessageResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>required .eCommunicationMessageType messageType = 1 [default = cmtNone];</code>
     */
    boolean hasMessageType();
    /**
     * <code>required .eCommunicationMessageType messageType = 1 [default = cmtNone];</code>
     */
    ProtoMessages.CommunicationMessageTypeBase.eCommunicationMessageType getMessageType();

    /**
     * <code>required bytes messageBody = 2 [default = "&#92;000"];</code>
     */
    boolean hasMessageBody();
    /**
     * <code>required bytes messageBody = 2 [default = "&#92;000"];</code>
     */
    com.google.protobuf.ByteString getMessageBody();

    /**
     * <code>required int32 errorCode = 3 [default = 0];</code>
     */
    boolean hasErrorCode();
    /**
     * <code>required int32 errorCode = 3 [default = 0];</code>
     */
    int getErrorCode();
  }
  /**
   * Protobuf type {@code MessageResponse}
   */
  public  static final class MessageResponse extends
      com.google.protobuf.GeneratedMessageLite<
          MessageResponse, MessageResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:MessageResponse)
      MessageResponseOrBuilder {
    private MessageResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
      messageType_ = 0;
      messageBody_ = com.google.protobuf.Internal.bytesDefaultValue("\000");
      errorCode_ = 0;
      com.google.protobuf.UnknownFieldSetLite.Builder unknownFields =
          com.google.protobuf.UnknownFieldSetLite.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              int rawValue = input.readEnum();
              ProtoMessages.CommunicationMessageTypeBase.eCommunicationMessageType value = ProtoMessages.CommunicationMessageTypeBase.eCommunicationMessageType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(1, rawValue);
              } else {
                bitField0_ |= 0x00000001;
                messageType_ = rawValue;
              }
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              messageBody_ = input.readBytes();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              errorCode_ = input.readInt32();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw new RuntimeException(e.setUnfinishedMessage(this));
      } catch (java.io.IOException e) {
        throw new RuntimeException(
            new com.google.protobuf.InvalidProtocolBufferException(
                e.getMessage()).setUnfinishedMessage(this));
      } finally {
        this.unknownFields = unknownFields.build();
      }
    }
    private int bitField0_;
    public static final int MESSAGETYPE_FIELD_NUMBER = 1;
    private int messageType_;
    /**
     * <code>required .eCommunicationMessageType messageType = 1 [default = cmtNone];</code>
     */
    public boolean hasMessageType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required .eCommunicationMessageType messageType = 1 [default = cmtNone];</code>
     */
    public ProtoMessages.CommunicationMessageTypeBase.eCommunicationMessageType getMessageType() {
      ProtoMessages.CommunicationMessageTypeBase.eCommunicationMessageType result = ProtoMessages.CommunicationMessageTypeBase.eCommunicationMessageType.valueOf(messageType_);
      return result == null ? ProtoMessages.CommunicationMessageTypeBase.eCommunicationMessageType.cmtNone : result;
    }
    /**
     * <code>required .eCommunicationMessageType messageType = 1 [default = cmtNone];</code>
     */
    private void setMessageType(ProtoMessages.CommunicationMessageTypeBase.eCommunicationMessageType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      messageType_ = value.getNumber();
    }
    /**
     * <code>required .eCommunicationMessageType messageType = 1 [default = cmtNone];</code>
     */
    private void clearMessageType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      messageType_ = 0;
    }

    public static final int MESSAGEBODY_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString messageBody_;
    /**
     * <code>required bytes messageBody = 2 [default = "&#92;000"];</code>
     */
    public boolean hasMessageBody() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required bytes messageBody = 2 [default = "&#92;000"];</code>
     */
    public com.google.protobuf.ByteString getMessageBody() {
      return messageBody_;
    }
    /**
     * <code>required bytes messageBody = 2 [default = "&#92;000"];</code>
     */
    private void setMessageBody(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      messageBody_ = value;
    }
    /**
     * <code>required bytes messageBody = 2 [default = "&#92;000"];</code>
     */
    private void clearMessageBody() {
      bitField0_ = (bitField0_ & ~0x00000002);
      messageBody_ = getDefaultInstance().getMessageBody();
    }

    public static final int ERRORCODE_FIELD_NUMBER = 3;
    private int errorCode_;
    /**
     * <code>required int32 errorCode = 3 [default = 0];</code>
     */
    public boolean hasErrorCode() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>required int32 errorCode = 3 [default = 0];</code>
     */
    public int getErrorCode() {
      return errorCode_;
    }
    /**
     * <code>required int32 errorCode = 3 [default = 0];</code>
     */
    private void setErrorCode(int value) {
      bitField0_ |= 0x00000004;
      errorCode_ = value;
    }
    /**
     * <code>required int32 errorCode = 3 [default = 0];</code>
     */
    private void clearErrorCode() {
      bitField0_ = (bitField0_ & ~0x00000004);
      errorCode_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeEnum(1, messageType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, messageBody_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, errorCode_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(1, messageType_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, messageBody_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, errorCode_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    public static ProtoMessages.MessageResponseBase.MessageResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoMessages.MessageResponseBase.MessageResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoMessages.MessageResponseBase.MessageResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProtoMessages.MessageResponseBase.MessageResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProtoMessages.MessageResponseBase.MessageResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ProtoMessages.MessageResponseBase.MessageResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static ProtoMessages.MessageResponseBase.MessageResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static ProtoMessages.MessageResponseBase.MessageResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static ProtoMessages.MessageResponseBase.MessageResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static ProtoMessages.MessageResponseBase.MessageResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ProtoMessages.MessageResponseBase.MessageResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code MessageResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          ProtoMessages.MessageResponseBase.MessageResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:MessageResponse)
        ProtoMessages.MessageResponseBase.MessageResponseOrBuilder {
      // Construct using ProtoMessages.MessageResponseBase.MessageResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>required .eCommunicationMessageType messageType = 1 [default = cmtNone];</code>
       */
      public boolean hasMessageType() {
        return instance.hasMessageType();
      }
      /**
       * <code>required .eCommunicationMessageType messageType = 1 [default = cmtNone];</code>
       */
      public ProtoMessages.CommunicationMessageTypeBase.eCommunicationMessageType getMessageType() {
        return instance.getMessageType();
      }
      /**
       * <code>required .eCommunicationMessageType messageType = 1 [default = cmtNone];</code>
       */
      public Builder setMessageType(ProtoMessages.CommunicationMessageTypeBase.eCommunicationMessageType value) {
        copyOnWrite();
        instance.setMessageType(value);
        return this;
      }
      /**
       * <code>required .eCommunicationMessageType messageType = 1 [default = cmtNone];</code>
       */
      public Builder clearMessageType() {
        copyOnWrite();
        instance.clearMessageType();
        return this;
      }

      /**
       * <code>required bytes messageBody = 2 [default = "&#92;000"];</code>
       */
      public boolean hasMessageBody() {
        return instance.hasMessageBody();
      }
      /**
       * <code>required bytes messageBody = 2 [default = "&#92;000"];</code>
       */
      public com.google.protobuf.ByteString getMessageBody() {
        return instance.getMessageBody();
      }
      /**
       * <code>required bytes messageBody = 2 [default = "&#92;000"];</code>
       */
      public Builder setMessageBody(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setMessageBody(value);
        return this;
      }
      /**
       * <code>required bytes messageBody = 2 [default = "&#92;000"];</code>
       */
      public Builder clearMessageBody() {
        copyOnWrite();
        instance.clearMessageBody();
        return this;
      }

      /**
       * <code>required int32 errorCode = 3 [default = 0];</code>
       */
      public boolean hasErrorCode() {
        return instance.hasErrorCode();
      }
      /**
       * <code>required int32 errorCode = 3 [default = 0];</code>
       */
      public int getErrorCode() {
        return instance.getErrorCode();
      }
      /**
       * <code>required int32 errorCode = 3 [default = 0];</code>
       */
      public Builder setErrorCode(int value) {
        copyOnWrite();
        instance.setErrorCode(value);
        return this;
      }
      /**
       * <code>required int32 errorCode = 3 [default = 0];</code>
       */
      public Builder clearErrorCode() {
        copyOnWrite();
        instance.clearErrorCode();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:MessageResponse)
    }
    private byte memoizedIsInitialized = -1;
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object... args) {
      switch (method) {
        case PARSE_PARTIAL_FROM: {
          return new ProtoMessages.MessageResponseBase.MessageResponse(          (com.google.protobuf.CodedInputStream) args[0],
              (com.google.protobuf.ExtensionRegistryLite) args[1]);
        }
        case NEW_INSTANCE: {
          return new ProtoMessages.MessageResponseBase.MessageResponse(
              com.google.protobuf.Internal.EMPTY_CODED_INPUT_STREAM,
              com.google.protobuf.ExtensionRegistryLite
                  .getEmptyRegistry());
        }
        case IS_INITIALIZED: {
          byte isInitialized = memoizedIsInitialized;
          if (isInitialized == 1) return DEFAULT_INSTANCE;
          if (isInitialized == 0) return null;

          boolean shouldMemoize = ((Boolean) args[0]).booleanValue();
          if (!hasMessageType()) {
            if (shouldMemoize) {
              memoizedIsInitialized = 0;
            }
            return null;
          }
          if (!hasMessageBody()) {
            if (shouldMemoize) {
              memoizedIsInitialized = 0;
            }
            return null;
          }
          if (!hasErrorCode()) {
            if (shouldMemoize) {
              memoizedIsInitialized = 0;
            }
            return null;
          }
          if (shouldMemoize) memoizedIsInitialized = 1;
          return DEFAULT_INSTANCE;

        }
        case MAKE_IMMUTABLE: {
          return null;}
        case NEW_BUILDER: {
          return new Builder();}
        case MERGE_FROM: {
          Object arg = args[0];
          if (arg == ProtoMessages.MessageResponseBase.MessageResponse.getDefaultInstance()) return this;
          ProtoMessages.MessageResponseBase.MessageResponse other = (ProtoMessages.MessageResponseBase.MessageResponse) arg;
          if (other.hasMessageType()) {
            setMessageType(other.getMessageType());
          }
          if (other.hasMessageBody()) {
            setMessageBody(other.getMessageBody());
          }
          if (other.hasErrorCode()) {
            setErrorCode(other.getErrorCode());
          }
          this.mergeUnknownFields(other.unknownFields);
          return this;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:MessageResponse)
    private static final ProtoMessages.MessageResponseBase.MessageResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MessageResponse(
          com.google.protobuf.Internal
              .EMPTY_CODED_INPUT_STREAM,
          com.google.protobuf.ExtensionRegistryLite
              .getEmptyRegistry());
    }

    public static ProtoMessages.MessageResponseBase.MessageResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    public static final com.google.protobuf.Parser<MessageResponse> PARSER =
        new DefaultInstanceBasedParser(DEFAULT_INSTANCE);

    static {
      com.google.protobuf.GeneratedMessageLite.onLoad(
          ProtoMessages.MessageResponseBase.MessageResponse.class, new com.google.protobuf.GeneratedMessageLite
              .PrototypeHolder<ProtoMessages.MessageResponseBase.MessageResponse, Builder>(
                  DEFAULT_INSTANCE, PARSER));}

  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
