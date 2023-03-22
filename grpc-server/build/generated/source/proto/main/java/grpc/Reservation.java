// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Enrollment.proto

package grpc;

/**
 * Protobuf type {@code grpc.Reservation}
 */
public final class Reservation extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.Reservation)
    ReservationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Reservation.newBuilder() to construct.
  private Reservation(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Reservation() {
    reservationId_ = "";
    studentId_ = "";
    courseId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Reservation();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Reservation(
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
            java.lang.String s = input.readStringRequireUtf8();

            reservationId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            studentId_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            courseId_ = s;
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
    return grpc.Enrollment.internal_static_grpc_Reservation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.Enrollment.internal_static_grpc_Reservation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.Reservation.class, grpc.Reservation.Builder.class);
  }

  public static final int RESERVATIONID_FIELD_NUMBER = 1;
  private volatile java.lang.Object reservationId_;
  /**
   * <code>string reservationId = 1;</code>
   * @return The reservationId.
   */
  @java.lang.Override
  public java.lang.String getReservationId() {
    java.lang.Object ref = reservationId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      reservationId_ = s;
      return s;
    }
  }
  /**
   * <code>string reservationId = 1;</code>
   * @return The bytes for reservationId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getReservationIdBytes() {
    java.lang.Object ref = reservationId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      reservationId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STUDENTID_FIELD_NUMBER = 2;
  private volatile java.lang.Object studentId_;
  /**
   * <code>string studentId = 2;</code>
   * @return The studentId.
   */
  @java.lang.Override
  public java.lang.String getStudentId() {
    java.lang.Object ref = studentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      studentId_ = s;
      return s;
    }
  }
  /**
   * <code>string studentId = 2;</code>
   * @return The bytes for studentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getStudentIdBytes() {
    java.lang.Object ref = studentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      studentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COURSEID_FIELD_NUMBER = 3;
  private volatile java.lang.Object courseId_;
  /**
   * <code>string courseId = 3;</code>
   * @return The courseId.
   */
  @java.lang.Override
  public java.lang.String getCourseId() {
    java.lang.Object ref = courseId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      courseId_ = s;
      return s;
    }
  }
  /**
   * <code>string courseId = 3;</code>
   * @return The bytes for courseId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCourseIdBytes() {
    java.lang.Object ref = courseId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      courseId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reservationId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reservationId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(studentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, studentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(courseId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, courseId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(reservationId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, reservationId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(studentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, studentId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(courseId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, courseId_);
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
    if (!(obj instanceof grpc.Reservation)) {
      return super.equals(obj);
    }
    grpc.Reservation other = (grpc.Reservation) obj;

    if (!getReservationId()
        .equals(other.getReservationId())) return false;
    if (!getStudentId()
        .equals(other.getStudentId())) return false;
    if (!getCourseId()
        .equals(other.getCourseId())) return false;
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
    hash = (37 * hash) + RESERVATIONID_FIELD_NUMBER;
    hash = (53 * hash) + getReservationId().hashCode();
    hash = (37 * hash) + STUDENTID_FIELD_NUMBER;
    hash = (53 * hash) + getStudentId().hashCode();
    hash = (37 * hash) + COURSEID_FIELD_NUMBER;
    hash = (53 * hash) + getCourseId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.Reservation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.Reservation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.Reservation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.Reservation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.Reservation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.Reservation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.Reservation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.Reservation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.Reservation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.Reservation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.Reservation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.Reservation parseFrom(
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
  public static Builder newBuilder(grpc.Reservation prototype) {
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
   * Protobuf type {@code grpc.Reservation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.Reservation)
      grpc.ReservationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.Enrollment.internal_static_grpc_Reservation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.Enrollment.internal_static_grpc_Reservation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.Reservation.class, grpc.Reservation.Builder.class);
    }

    // Construct using grpc.Reservation.newBuilder()
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
      reservationId_ = "";

      studentId_ = "";

      courseId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.Enrollment.internal_static_grpc_Reservation_descriptor;
    }

    @java.lang.Override
    public grpc.Reservation getDefaultInstanceForType() {
      return grpc.Reservation.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.Reservation build() {
      grpc.Reservation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.Reservation buildPartial() {
      grpc.Reservation result = new grpc.Reservation(this);
      result.reservationId_ = reservationId_;
      result.studentId_ = studentId_;
      result.courseId_ = courseId_;
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
      if (other instanceof grpc.Reservation) {
        return mergeFrom((grpc.Reservation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.Reservation other) {
      if (other == grpc.Reservation.getDefaultInstance()) return this;
      if (!other.getReservationId().isEmpty()) {
        reservationId_ = other.reservationId_;
        onChanged();
      }
      if (!other.getStudentId().isEmpty()) {
        studentId_ = other.studentId_;
        onChanged();
      }
      if (!other.getCourseId().isEmpty()) {
        courseId_ = other.courseId_;
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
      grpc.Reservation parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.Reservation) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object reservationId_ = "";
    /**
     * <code>string reservationId = 1;</code>
     * @return The reservationId.
     */
    public java.lang.String getReservationId() {
      java.lang.Object ref = reservationId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        reservationId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string reservationId = 1;</code>
     * @return The bytes for reservationId.
     */
    public com.google.protobuf.ByteString
        getReservationIdBytes() {
      java.lang.Object ref = reservationId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        reservationId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string reservationId = 1;</code>
     * @param value The reservationId to set.
     * @return This builder for chaining.
     */
    public Builder setReservationId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      reservationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string reservationId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearReservationId() {
      
      reservationId_ = getDefaultInstance().getReservationId();
      onChanged();
      return this;
    }
    /**
     * <code>string reservationId = 1;</code>
     * @param value The bytes for reservationId to set.
     * @return This builder for chaining.
     */
    public Builder setReservationIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      reservationId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object studentId_ = "";
    /**
     * <code>string studentId = 2;</code>
     * @return The studentId.
     */
    public java.lang.String getStudentId() {
      java.lang.Object ref = studentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        studentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string studentId = 2;</code>
     * @return The bytes for studentId.
     */
    public com.google.protobuf.ByteString
        getStudentIdBytes() {
      java.lang.Object ref = studentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        studentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string studentId = 2;</code>
     * @param value The studentId to set.
     * @return This builder for chaining.
     */
    public Builder setStudentId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      studentId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string studentId = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStudentId() {
      
      studentId_ = getDefaultInstance().getStudentId();
      onChanged();
      return this;
    }
    /**
     * <code>string studentId = 2;</code>
     * @param value The bytes for studentId to set.
     * @return This builder for chaining.
     */
    public Builder setStudentIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      studentId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object courseId_ = "";
    /**
     * <code>string courseId = 3;</code>
     * @return The courseId.
     */
    public java.lang.String getCourseId() {
      java.lang.Object ref = courseId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        courseId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string courseId = 3;</code>
     * @return The bytes for courseId.
     */
    public com.google.protobuf.ByteString
        getCourseIdBytes() {
      java.lang.Object ref = courseId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        courseId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string courseId = 3;</code>
     * @param value The courseId to set.
     * @return This builder for chaining.
     */
    public Builder setCourseId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      courseId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string courseId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCourseId() {
      
      courseId_ = getDefaultInstance().getCourseId();
      onChanged();
      return this;
    }
    /**
     * <code>string courseId = 3;</code>
     * @param value The bytes for courseId to set.
     * @return This builder for chaining.
     */
    public Builder setCourseIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      courseId_ = value;
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


    // @@protoc_insertion_point(builder_scope:grpc.Reservation)
  }

  // @@protoc_insertion_point(class_scope:grpc.Reservation)
  private static final grpc.Reservation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.Reservation();
  }

  public static grpc.Reservation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reservation>
      PARSER = new com.google.protobuf.AbstractParser<Reservation>() {
    @java.lang.Override
    public Reservation parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Reservation(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Reservation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reservation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.Reservation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
