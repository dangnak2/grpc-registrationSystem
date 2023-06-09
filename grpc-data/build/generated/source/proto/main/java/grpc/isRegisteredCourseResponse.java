// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Enrollment.proto

package grpc;

/**
 * Protobuf type {@code grpc.isRegisteredCourseResponse}
 */
public final class isRegisteredCourseResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.isRegisteredCourseResponse)
    isRegisteredCourseResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use isRegisteredCourseResponse.newBuilder() to construct.
  private isRegisteredCourseResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private isRegisteredCourseResponse() {
    status_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new isRegisteredCourseResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private isRegisteredCourseResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            grpc.Course.Builder subBuilder = null;
            if (course_ != null) {
              subBuilder = course_.toBuilder();
            }
            course_ = input.readMessage(grpc.Course.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(course_);
              course_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            status_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return grpc.Enrollment.internal_static_grpc_isRegisteredCourseResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.Enrollment.internal_static_grpc_isRegisteredCourseResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.isRegisteredCourseResponse.class, grpc.isRegisteredCourseResponse.Builder.class);
  }

  public static final int COURSE_FIELD_NUMBER = 1;
  private grpc.Course course_;
  /**
   * <code>.grpc.Course course = 1;</code>
   * @return Whether the course field is set.
   */
  @java.lang.Override
  public boolean hasCourse() {
    return course_ != null;
  }
  /**
   * <code>.grpc.Course course = 1;</code>
   * @return The course.
   */
  @java.lang.Override
  public grpc.Course getCourse() {
    return course_ == null ? grpc.Course.getDefaultInstance() : course_;
  }
  /**
   * <code>.grpc.Course course = 1;</code>
   */
  @java.lang.Override
  public grpc.CourseOrBuilder getCourseOrBuilder() {
    return getCourse();
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private volatile java.lang.Object status_;
  /**
   * <code>string status = 2;</code>
   * @return The status.
   */
  @java.lang.Override
  public java.lang.String getStatus() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      status_ = s;
      return s;
    }
  }
  /**
   * <code>string status = 2;</code>
   * @return The bytes for status.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStatusBytes() {
    java.lang.Object ref = status_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      status_ = b;
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
    if (course_ != null) {
      output.writeMessage(1, getCourse());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, status_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (course_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getCourse());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(status_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, status_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof grpc.isRegisteredCourseResponse)) {
      return super.equals(obj);
    }
    grpc.isRegisteredCourseResponse other = (grpc.isRegisteredCourseResponse) obj;

    if (hasCourse() != other.hasCourse()) return false;
    if (hasCourse()) {
      if (!getCourse()
          .equals(other.getCourse())) return false;
    }
    if (!getStatus()
        .equals(other.getStatus())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasCourse()) {
      hash = (37 * hash) + COURSE_FIELD_NUMBER;
      hash = (53 * hash) + getCourse().hashCode();
    }
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.isRegisteredCourseResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.isRegisteredCourseResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.isRegisteredCourseResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.isRegisteredCourseResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.isRegisteredCourseResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.isRegisteredCourseResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.isRegisteredCourseResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.isRegisteredCourseResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.isRegisteredCourseResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.isRegisteredCourseResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.isRegisteredCourseResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.isRegisteredCourseResponse parseFrom(
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
  public static Builder newBuilder(grpc.isRegisteredCourseResponse prototype) {
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
   * Protobuf type {@code grpc.isRegisteredCourseResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.isRegisteredCourseResponse)
      grpc.isRegisteredCourseResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.Enrollment.internal_static_grpc_isRegisteredCourseResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.Enrollment.internal_static_grpc_isRegisteredCourseResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.isRegisteredCourseResponse.class, grpc.isRegisteredCourseResponse.Builder.class);
    }

    // Construct using grpc.isRegisteredCourseResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (courseBuilder_ == null) {
        course_ = null;
      } else {
        course_ = null;
        courseBuilder_ = null;
      }
      status_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.Enrollment.internal_static_grpc_isRegisteredCourseResponse_descriptor;
    }

    @java.lang.Override
    public grpc.isRegisteredCourseResponse getDefaultInstanceForType() {
      return grpc.isRegisteredCourseResponse.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.isRegisteredCourseResponse build() {
      grpc.isRegisteredCourseResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.isRegisteredCourseResponse buildPartial() {
      grpc.isRegisteredCourseResponse result = new grpc.isRegisteredCourseResponse(this);
      if (courseBuilder_ == null) {
        result.course_ = course_;
      } else {
        result.course_ = courseBuilder_.build();
      }
      result.status_ = status_;
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
      if (other instanceof grpc.isRegisteredCourseResponse) {
        return mergeFrom((grpc.isRegisteredCourseResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.isRegisteredCourseResponse other) {
      if (other == grpc.isRegisteredCourseResponse.getDefaultInstance()) return this;
      if (other.hasCourse()) {
        mergeCourse(other.getCourse());
      }
      if (!other.getStatus().isEmpty()) {
        status_ = other.status_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      grpc.isRegisteredCourseResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.isRegisteredCourseResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private grpc.Course course_;
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.Course, grpc.Course.Builder, grpc.CourseOrBuilder> courseBuilder_;
    /**
     * <code>.grpc.Course course = 1;</code>
     * @return Whether the course field is set.
     */
    public boolean hasCourse() {
      return courseBuilder_ != null || course_ != null;
    }
    /**
     * <code>.grpc.Course course = 1;</code>
     * @return The course.
     */
    public grpc.Course getCourse() {
      if (courseBuilder_ == null) {
        return course_ == null ? grpc.Course.getDefaultInstance() : course_;
      } else {
        return courseBuilder_.getMessage();
      }
    }
    /**
     * <code>.grpc.Course course = 1;</code>
     */
    public Builder setCourse(grpc.Course value) {
      if (courseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        course_ = value;
        onChanged();
      } else {
        courseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.grpc.Course course = 1;</code>
     */
    public Builder setCourse(
        grpc.Course.Builder builderForValue) {
      if (courseBuilder_ == null) {
        course_ = builderForValue.build();
        onChanged();
      } else {
        courseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.grpc.Course course = 1;</code>
     */
    public Builder mergeCourse(grpc.Course value) {
      if (courseBuilder_ == null) {
        if (course_ != null) {
          course_ =
            grpc.Course.newBuilder(course_).mergeFrom(value).buildPartial();
        } else {
          course_ = value;
        }
        onChanged();
      } else {
        courseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.grpc.Course course = 1;</code>
     */
    public Builder clearCourse() {
      if (courseBuilder_ == null) {
        course_ = null;
        onChanged();
      } else {
        course_ = null;
        courseBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.grpc.Course course = 1;</code>
     */
    public grpc.Course.Builder getCourseBuilder() {
      
      onChanged();
      return getCourseFieldBuilder().getBuilder();
    }
    /**
     * <code>.grpc.Course course = 1;</code>
     */
    public grpc.CourseOrBuilder getCourseOrBuilder() {
      if (courseBuilder_ != null) {
        return courseBuilder_.getMessageOrBuilder();
      } else {
        return course_ == null ?
            grpc.Course.getDefaultInstance() : course_;
      }
    }
    /**
     * <code>.grpc.Course course = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        grpc.Course, grpc.Course.Builder, grpc.CourseOrBuilder> 
        getCourseFieldBuilder() {
      if (courseBuilder_ == null) {
        courseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            grpc.Course, grpc.Course.Builder, grpc.CourseOrBuilder>(
                getCourse(),
                getParentForChildren(),
                isClean());
        course_ = null;
      }
      return courseBuilder_;
    }

    private java.lang.Object status_ = "";
    /**
     * <code>string status = 2;</code>
     * @return The status.
     */
    public java.lang.String getStatus() {
      java.lang.Object ref = status_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        status_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string status = 2;</code>
     * @return The bytes for status.
     */
    public com.google.protobuf.ByteString
        getStatusBytes() {
      java.lang.Object ref = status_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        status_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string status = 2;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string status = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = getDefaultInstance().getStatus();
      onChanged();
      return this;
    }
    /**
     * <code>string status = 2;</code>
     * @param value The bytes for status to set.
     * @return This builder for chaining.
     */
    public Builder setStatusBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      status_ = value;
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


    // @@protoc_insertion_point(builder_scope:grpc.isRegisteredCourseResponse)
  }

  // @@protoc_insertion_point(class_scope:grpc.isRegisteredCourseResponse)
  private static final grpc.isRegisteredCourseResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.isRegisteredCourseResponse();
  }

  public static grpc.isRegisteredCourseResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<isRegisteredCourseResponse>
      PARSER = new com.google.protobuf.AbstractParser<isRegisteredCourseResponse>() {
    @java.lang.Override
    public isRegisteredCourseResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new isRegisteredCourseResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<isRegisteredCourseResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<isRegisteredCourseResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.isRegisteredCourseResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

