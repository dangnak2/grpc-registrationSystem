// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Enrollment.proto

package grpc;

/**
 * Protobuf type {@code grpc.addCourseRequest}
 */
public final class addCourseRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:grpc.addCourseRequest)
    addCourseRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use addCourseRequest.newBuilder() to construct.
  private addCourseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private addCourseRequest() {
    courseId_ = "";
    courseName_ = "";
    professorName_ = "";
    classroomList_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new addCourseRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private addCourseRequest(
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

            courseId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            courseName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            professorName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            classroomList_ = s;
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
    return grpc.Enrollment.internal_static_grpc_addCourseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return grpc.Enrollment.internal_static_grpc_addCourseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            grpc.addCourseRequest.class, grpc.addCourseRequest.Builder.class);
  }

  public static final int COURSEID_FIELD_NUMBER = 1;
  private volatile java.lang.Object courseId_;
  /**
   * <code>string courseId = 1;</code>
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
   * <code>string courseId = 1;</code>
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

  public static final int COURSENAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object courseName_;
  /**
   * <code>string courseName = 2;</code>
   * @return The courseName.
   */
  @java.lang.Override
  public java.lang.String getCourseName() {
    java.lang.Object ref = courseName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      courseName_ = s;
      return s;
    }
  }
  /**
   * <code>string courseName = 2;</code>
   * @return The bytes for courseName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCourseNameBytes() {
    java.lang.Object ref = courseName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      courseName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROFESSORNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object professorName_;
  /**
   * <code>string professorName = 3;</code>
   * @return The professorName.
   */
  @java.lang.Override
  public java.lang.String getProfessorName() {
    java.lang.Object ref = professorName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      professorName_ = s;
      return s;
    }
  }
  /**
   * <code>string professorName = 3;</code>
   * @return The bytes for professorName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProfessorNameBytes() {
    java.lang.Object ref = professorName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      professorName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLASSROOMLIST_FIELD_NUMBER = 4;
  private volatile java.lang.Object classroomList_;
  /**
   * <code>string classroomList = 4;</code>
   * @return The classroomList.
   */
  @java.lang.Override
  public java.lang.String getClassroomList() {
    java.lang.Object ref = classroomList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      classroomList_ = s;
      return s;
    }
  }
  /**
   * <code>string classroomList = 4;</code>
   * @return The bytes for classroomList.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClassroomListBytes() {
    java.lang.Object ref = classroomList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      classroomList_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(courseId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, courseId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(courseName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, courseName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(professorName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, professorName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classroomList_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, classroomList_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(courseId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, courseId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(courseName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, courseName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(professorName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, professorName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(classroomList_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, classroomList_);
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
    if (!(obj instanceof grpc.addCourseRequest)) {
      return super.equals(obj);
    }
    grpc.addCourseRequest other = (grpc.addCourseRequest) obj;

    if (!getCourseId()
        .equals(other.getCourseId())) return false;
    if (!getCourseName()
        .equals(other.getCourseName())) return false;
    if (!getProfessorName()
        .equals(other.getProfessorName())) return false;
    if (!getClassroomList()
        .equals(other.getClassroomList())) return false;
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
    hash = (37 * hash) + COURSEID_FIELD_NUMBER;
    hash = (53 * hash) + getCourseId().hashCode();
    hash = (37 * hash) + COURSENAME_FIELD_NUMBER;
    hash = (53 * hash) + getCourseName().hashCode();
    hash = (37 * hash) + PROFESSORNAME_FIELD_NUMBER;
    hash = (53 * hash) + getProfessorName().hashCode();
    hash = (37 * hash) + CLASSROOMLIST_FIELD_NUMBER;
    hash = (53 * hash) + getClassroomList().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static grpc.addCourseRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.addCourseRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.addCourseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.addCourseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.addCourseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static grpc.addCourseRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static grpc.addCourseRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.addCourseRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.addCourseRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static grpc.addCourseRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static grpc.addCourseRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static grpc.addCourseRequest parseFrom(
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
  public static Builder newBuilder(grpc.addCourseRequest prototype) {
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
   * Protobuf type {@code grpc.addCourseRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:grpc.addCourseRequest)
      grpc.addCourseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return grpc.Enrollment.internal_static_grpc_addCourseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return grpc.Enrollment.internal_static_grpc_addCourseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              grpc.addCourseRequest.class, grpc.addCourseRequest.Builder.class);
    }

    // Construct using grpc.addCourseRequest.newBuilder()
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
      courseId_ = "";

      courseName_ = "";

      professorName_ = "";

      classroomList_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return grpc.Enrollment.internal_static_grpc_addCourseRequest_descriptor;
    }

    @java.lang.Override
    public grpc.addCourseRequest getDefaultInstanceForType() {
      return grpc.addCourseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public grpc.addCourseRequest build() {
      grpc.addCourseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public grpc.addCourseRequest buildPartial() {
      grpc.addCourseRequest result = new grpc.addCourseRequest(this);
      result.courseId_ = courseId_;
      result.courseName_ = courseName_;
      result.professorName_ = professorName_;
      result.classroomList_ = classroomList_;
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
      if (other instanceof grpc.addCourseRequest) {
        return mergeFrom((grpc.addCourseRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(grpc.addCourseRequest other) {
      if (other == grpc.addCourseRequest.getDefaultInstance()) return this;
      if (!other.getCourseId().isEmpty()) {
        courseId_ = other.courseId_;
        onChanged();
      }
      if (!other.getCourseName().isEmpty()) {
        courseName_ = other.courseName_;
        onChanged();
      }
      if (!other.getProfessorName().isEmpty()) {
        professorName_ = other.professorName_;
        onChanged();
      }
      if (!other.getClassroomList().isEmpty()) {
        classroomList_ = other.classroomList_;
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
      grpc.addCourseRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (grpc.addCourseRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object courseId_ = "";
    /**
     * <code>string courseId = 1;</code>
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
     * <code>string courseId = 1;</code>
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
     * <code>string courseId = 1;</code>
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
     * <code>string courseId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCourseId() {
      
      courseId_ = getDefaultInstance().getCourseId();
      onChanged();
      return this;
    }
    /**
     * <code>string courseId = 1;</code>
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

    private java.lang.Object courseName_ = "";
    /**
     * <code>string courseName = 2;</code>
     * @return The courseName.
     */
    public java.lang.String getCourseName() {
      java.lang.Object ref = courseName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        courseName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string courseName = 2;</code>
     * @return The bytes for courseName.
     */
    public com.google.protobuf.ByteString
        getCourseNameBytes() {
      java.lang.Object ref = courseName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        courseName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string courseName = 2;</code>
     * @param value The courseName to set.
     * @return This builder for chaining.
     */
    public Builder setCourseName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      courseName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string courseName = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCourseName() {
      
      courseName_ = getDefaultInstance().getCourseName();
      onChanged();
      return this;
    }
    /**
     * <code>string courseName = 2;</code>
     * @param value The bytes for courseName to set.
     * @return This builder for chaining.
     */
    public Builder setCourseNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      courseName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object professorName_ = "";
    /**
     * <code>string professorName = 3;</code>
     * @return The professorName.
     */
    public java.lang.String getProfessorName() {
      java.lang.Object ref = professorName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        professorName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string professorName = 3;</code>
     * @return The bytes for professorName.
     */
    public com.google.protobuf.ByteString
        getProfessorNameBytes() {
      java.lang.Object ref = professorName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        professorName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string professorName = 3;</code>
     * @param value The professorName to set.
     * @return This builder for chaining.
     */
    public Builder setProfessorName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      professorName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string professorName = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearProfessorName() {
      
      professorName_ = getDefaultInstance().getProfessorName();
      onChanged();
      return this;
    }
    /**
     * <code>string professorName = 3;</code>
     * @param value The bytes for professorName to set.
     * @return This builder for chaining.
     */
    public Builder setProfessorNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      professorName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object classroomList_ = "";
    /**
     * <code>string classroomList = 4;</code>
     * @return The classroomList.
     */
    public java.lang.String getClassroomList() {
      java.lang.Object ref = classroomList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        classroomList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string classroomList = 4;</code>
     * @return The bytes for classroomList.
     */
    public com.google.protobuf.ByteString
        getClassroomListBytes() {
      java.lang.Object ref = classroomList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        classroomList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string classroomList = 4;</code>
     * @param value The classroomList to set.
     * @return This builder for chaining.
     */
    public Builder setClassroomList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      classroomList_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string classroomList = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearClassroomList() {
      
      classroomList_ = getDefaultInstance().getClassroomList();
      onChanged();
      return this;
    }
    /**
     * <code>string classroomList = 4;</code>
     * @param value The bytes for classroomList to set.
     * @return This builder for chaining.
     */
    public Builder setClassroomListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      classroomList_ = value;
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


    // @@protoc_insertion_point(builder_scope:grpc.addCourseRequest)
  }

  // @@protoc_insertion_point(class_scope:grpc.addCourseRequest)
  private static final grpc.addCourseRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new grpc.addCourseRequest();
  }

  public static grpc.addCourseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<addCourseRequest>
      PARSER = new com.google.protobuf.AbstractParser<addCourseRequest>() {
    @java.lang.Override
    public addCourseRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new addCourseRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<addCourseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<addCourseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public grpc.addCourseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

