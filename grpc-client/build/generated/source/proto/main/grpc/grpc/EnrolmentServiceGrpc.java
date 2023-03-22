package grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.48.1)",
    comments = "Source: Enrollment.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EnrolmentServiceGrpc {

  private EnrolmentServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.EnrolmentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<grpc.Empty,
      grpc.getAllStudentDataResponse> getGetAllStudentDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllStudentData",
      requestType = grpc.Empty.class,
      responseType = grpc.getAllStudentDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Empty,
      grpc.getAllStudentDataResponse> getGetAllStudentDataMethod() {
    io.grpc.MethodDescriptor<grpc.Empty, grpc.getAllStudentDataResponse> getGetAllStudentDataMethod;
    if ((getGetAllStudentDataMethod = EnrolmentServiceGrpc.getGetAllStudentDataMethod) == null) {
      synchronized (EnrolmentServiceGrpc.class) {
        if ((getGetAllStudentDataMethod = EnrolmentServiceGrpc.getGetAllStudentDataMethod) == null) {
          EnrolmentServiceGrpc.getGetAllStudentDataMethod = getGetAllStudentDataMethod =
              io.grpc.MethodDescriptor.<grpc.Empty, grpc.getAllStudentDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllStudentData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.getAllStudentDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrolmentServiceMethodDescriptorSupplier("getAllStudentData"))
              .build();
        }
      }
    }
    return getGetAllStudentDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.Empty,
      grpc.getAllCourseDataResponse> getGetAllCourseDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllCourseData",
      requestType = grpc.Empty.class,
      responseType = grpc.getAllCourseDataResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.Empty,
      grpc.getAllCourseDataResponse> getGetAllCourseDataMethod() {
    io.grpc.MethodDescriptor<grpc.Empty, grpc.getAllCourseDataResponse> getGetAllCourseDataMethod;
    if ((getGetAllCourseDataMethod = EnrolmentServiceGrpc.getGetAllCourseDataMethod) == null) {
      synchronized (EnrolmentServiceGrpc.class) {
        if ((getGetAllCourseDataMethod = EnrolmentServiceGrpc.getGetAllCourseDataMethod) == null) {
          EnrolmentServiceGrpc.getGetAllCourseDataMethod = getGetAllCourseDataMethod =
              io.grpc.MethodDescriptor.<grpc.Empty, grpc.getAllCourseDataResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllCourseData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.getAllCourseDataResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrolmentServiceMethodDescriptorSupplier("getAllCourseData"))
              .build();
        }
      }
    }
    return getGetAllCourseDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.addStudentRequest,
      grpc.addStudentResponse> getAddStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addStudent",
      requestType = grpc.addStudentRequest.class,
      responseType = grpc.addStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.addStudentRequest,
      grpc.addStudentResponse> getAddStudentMethod() {
    io.grpc.MethodDescriptor<grpc.addStudentRequest, grpc.addStudentResponse> getAddStudentMethod;
    if ((getAddStudentMethod = EnrolmentServiceGrpc.getAddStudentMethod) == null) {
      synchronized (EnrolmentServiceGrpc.class) {
        if ((getAddStudentMethod = EnrolmentServiceGrpc.getAddStudentMethod) == null) {
          EnrolmentServiceGrpc.getAddStudentMethod = getAddStudentMethod =
              io.grpc.MethodDescriptor.<grpc.addStudentRequest, grpc.addStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.addStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.addStudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrolmentServiceMethodDescriptorSupplier("addStudent"))
              .build();
        }
      }
    }
    return getAddStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.deleteStudentRequest,
      grpc.deleteStudentResponse> getDeleteStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteStudent",
      requestType = grpc.deleteStudentRequest.class,
      responseType = grpc.deleteStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.deleteStudentRequest,
      grpc.deleteStudentResponse> getDeleteStudentMethod() {
    io.grpc.MethodDescriptor<grpc.deleteStudentRequest, grpc.deleteStudentResponse> getDeleteStudentMethod;
    if ((getDeleteStudentMethod = EnrolmentServiceGrpc.getDeleteStudentMethod) == null) {
      synchronized (EnrolmentServiceGrpc.class) {
        if ((getDeleteStudentMethod = EnrolmentServiceGrpc.getDeleteStudentMethod) == null) {
          EnrolmentServiceGrpc.getDeleteStudentMethod = getDeleteStudentMethod =
              io.grpc.MethodDescriptor.<grpc.deleteStudentRequest, grpc.deleteStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.deleteStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.deleteStudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrolmentServiceMethodDescriptorSupplier("deleteStudent"))
              .build();
        }
      }
    }
    return getDeleteStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.addCourseRequest,
      grpc.addCourseResponse> getAddCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCourse",
      requestType = grpc.addCourseRequest.class,
      responseType = grpc.addCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.addCourseRequest,
      grpc.addCourseResponse> getAddCourseMethod() {
    io.grpc.MethodDescriptor<grpc.addCourseRequest, grpc.addCourseResponse> getAddCourseMethod;
    if ((getAddCourseMethod = EnrolmentServiceGrpc.getAddCourseMethod) == null) {
      synchronized (EnrolmentServiceGrpc.class) {
        if ((getAddCourseMethod = EnrolmentServiceGrpc.getAddCourseMethod) == null) {
          EnrolmentServiceGrpc.getAddCourseMethod = getAddCourseMethod =
              io.grpc.MethodDescriptor.<grpc.addCourseRequest, grpc.addCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.addCourseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.addCourseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrolmentServiceMethodDescriptorSupplier("addCourse"))
              .build();
        }
      }
    }
    return getAddCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.deleteCourseRequest,
      grpc.deleteCourseResponse> getDeleteCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteCourse",
      requestType = grpc.deleteCourseRequest.class,
      responseType = grpc.deleteCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.deleteCourseRequest,
      grpc.deleteCourseResponse> getDeleteCourseMethod() {
    io.grpc.MethodDescriptor<grpc.deleteCourseRequest, grpc.deleteCourseResponse> getDeleteCourseMethod;
    if ((getDeleteCourseMethod = EnrolmentServiceGrpc.getDeleteCourseMethod) == null) {
      synchronized (EnrolmentServiceGrpc.class) {
        if ((getDeleteCourseMethod = EnrolmentServiceGrpc.getDeleteCourseMethod) == null) {
          EnrolmentServiceGrpc.getDeleteCourseMethod = getDeleteCourseMethod =
              io.grpc.MethodDescriptor.<grpc.deleteCourseRequest, grpc.deleteCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.deleteCourseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.deleteCourseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrolmentServiceMethodDescriptorSupplier("deleteCourse"))
              .build();
        }
      }
    }
    return getDeleteCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.isRegisteredStudentRequest,
      grpc.isRegisteredStudentResponse> getIsRegisteredStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "isRegisteredStudent",
      requestType = grpc.isRegisteredStudentRequest.class,
      responseType = grpc.isRegisteredStudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.isRegisteredStudentRequest,
      grpc.isRegisteredStudentResponse> getIsRegisteredStudentMethod() {
    io.grpc.MethodDescriptor<grpc.isRegisteredStudentRequest, grpc.isRegisteredStudentResponse> getIsRegisteredStudentMethod;
    if ((getIsRegisteredStudentMethod = EnrolmentServiceGrpc.getIsRegisteredStudentMethod) == null) {
      synchronized (EnrolmentServiceGrpc.class) {
        if ((getIsRegisteredStudentMethod = EnrolmentServiceGrpc.getIsRegisteredStudentMethod) == null) {
          EnrolmentServiceGrpc.getIsRegisteredStudentMethod = getIsRegisteredStudentMethod =
              io.grpc.MethodDescriptor.<grpc.isRegisteredStudentRequest, grpc.isRegisteredStudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "isRegisteredStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.isRegisteredStudentRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.isRegisteredStudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrolmentServiceMethodDescriptorSupplier("isRegisteredStudent"))
              .build();
        }
      }
    }
    return getIsRegisteredStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.isRegisteredCourseRequest,
      grpc.isRegisteredCourseResponse> getIsRegisteredCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "isRegisteredCourse",
      requestType = grpc.isRegisteredCourseRequest.class,
      responseType = grpc.isRegisteredCourseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.isRegisteredCourseRequest,
      grpc.isRegisteredCourseResponse> getIsRegisteredCourseMethod() {
    io.grpc.MethodDescriptor<grpc.isRegisteredCourseRequest, grpc.isRegisteredCourseResponse> getIsRegisteredCourseMethod;
    if ((getIsRegisteredCourseMethod = EnrolmentServiceGrpc.getIsRegisteredCourseMethod) == null) {
      synchronized (EnrolmentServiceGrpc.class) {
        if ((getIsRegisteredCourseMethod = EnrolmentServiceGrpc.getIsRegisteredCourseMethod) == null) {
          EnrolmentServiceGrpc.getIsRegisteredCourseMethod = getIsRegisteredCourseMethod =
              io.grpc.MethodDescriptor.<grpc.isRegisteredCourseRequest, grpc.isRegisteredCourseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "isRegisteredCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.isRegisteredCourseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.isRegisteredCourseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrolmentServiceMethodDescriptorSupplier("isRegisteredCourse"))
              .build();
        }
      }
    }
    return getIsRegisteredCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.addReservationRequest,
      grpc.addReservationResponse> getAddReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addReservation",
      requestType = grpc.addReservationRequest.class,
      responseType = grpc.addReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.addReservationRequest,
      grpc.addReservationResponse> getAddReservationMethod() {
    io.grpc.MethodDescriptor<grpc.addReservationRequest, grpc.addReservationResponse> getAddReservationMethod;
    if ((getAddReservationMethod = EnrolmentServiceGrpc.getAddReservationMethod) == null) {
      synchronized (EnrolmentServiceGrpc.class) {
        if ((getAddReservationMethod = EnrolmentServiceGrpc.getAddReservationMethod) == null) {
          EnrolmentServiceGrpc.getAddReservationMethod = getAddReservationMethod =
              io.grpc.MethodDescriptor.<grpc.addReservationRequest, grpc.addReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.addReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.addReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrolmentServiceMethodDescriptorSupplier("addReservation"))
              .build();
        }
      }
    }
    return getAddReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<grpc.validateLoginRequest,
      grpc.validateLoginResponse> getValidateLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "validateLogin",
      requestType = grpc.validateLoginRequest.class,
      responseType = grpc.validateLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<grpc.validateLoginRequest,
      grpc.validateLoginResponse> getValidateLoginMethod() {
    io.grpc.MethodDescriptor<grpc.validateLoginRequest, grpc.validateLoginResponse> getValidateLoginMethod;
    if ((getValidateLoginMethod = EnrolmentServiceGrpc.getValidateLoginMethod) == null) {
      synchronized (EnrolmentServiceGrpc.class) {
        if ((getValidateLoginMethod = EnrolmentServiceGrpc.getValidateLoginMethod) == null) {
          EnrolmentServiceGrpc.getValidateLoginMethod = getValidateLoginMethod =
              io.grpc.MethodDescriptor.<grpc.validateLoginRequest, grpc.validateLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "validateLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.validateLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  grpc.validateLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new EnrolmentServiceMethodDescriptorSupplier("validateLogin"))
              .build();
        }
      }
    }
    return getValidateLoginMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnrolmentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnrolmentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnrolmentServiceStub>() {
        @java.lang.Override
        public EnrolmentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnrolmentServiceStub(channel, callOptions);
        }
      };
    return EnrolmentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnrolmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnrolmentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnrolmentServiceBlockingStub>() {
        @java.lang.Override
        public EnrolmentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnrolmentServiceBlockingStub(channel, callOptions);
        }
      };
    return EnrolmentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnrolmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EnrolmentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EnrolmentServiceFutureStub>() {
        @java.lang.Override
        public EnrolmentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EnrolmentServiceFutureStub(channel, callOptions);
        }
      };
    return EnrolmentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EnrolmentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getAllStudentData(grpc.Empty request,
        io.grpc.stub.StreamObserver<grpc.getAllStudentDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllStudentDataMethod(), responseObserver);
    }

    /**
     */
    public void getAllCourseData(grpc.Empty request,
        io.grpc.stub.StreamObserver<grpc.getAllCourseDataResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllCourseDataMethod(), responseObserver);
    }

    /**
     */
    public void addStudent(grpc.addStudentRequest request,
        io.grpc.stub.StreamObserver<grpc.addStudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStudentMethod(), responseObserver);
    }

    /**
     */
    public void deleteStudent(grpc.deleteStudentRequest request,
        io.grpc.stub.StreamObserver<grpc.deleteStudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStudentMethod(), responseObserver);
    }

    /**
     */
    public void addCourse(grpc.addCourseRequest request,
        io.grpc.stub.StreamObserver<grpc.addCourseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCourseMethod(), responseObserver);
    }

    /**
     */
    public void deleteCourse(grpc.deleteCourseRequest request,
        io.grpc.stub.StreamObserver<grpc.deleteCourseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCourseMethod(), responseObserver);
    }

    /**
     */
    public void isRegisteredStudent(grpc.isRegisteredStudentRequest request,
        io.grpc.stub.StreamObserver<grpc.isRegisteredStudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsRegisteredStudentMethod(), responseObserver);
    }

    /**
     */
    public void isRegisteredCourse(grpc.isRegisteredCourseRequest request,
        io.grpc.stub.StreamObserver<grpc.isRegisteredCourseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsRegisteredCourseMethod(), responseObserver);
    }

    /**
     */
    public void addReservation(grpc.addReservationRequest request,
        io.grpc.stub.StreamObserver<grpc.addReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddReservationMethod(), responseObserver);
    }

    /**
     */
    public void validateLogin(grpc.validateLoginRequest request,
        io.grpc.stub.StreamObserver<grpc.validateLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateLoginMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetAllStudentDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.Empty,
                grpc.getAllStudentDataResponse>(
                  this, METHODID_GET_ALL_STUDENT_DATA)))
          .addMethod(
            getGetAllCourseDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.Empty,
                grpc.getAllCourseDataResponse>(
                  this, METHODID_GET_ALL_COURSE_DATA)))
          .addMethod(
            getAddStudentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.addStudentRequest,
                grpc.addStudentResponse>(
                  this, METHODID_ADD_STUDENT)))
          .addMethod(
            getDeleteStudentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.deleteStudentRequest,
                grpc.deleteStudentResponse>(
                  this, METHODID_DELETE_STUDENT)))
          .addMethod(
            getAddCourseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.addCourseRequest,
                grpc.addCourseResponse>(
                  this, METHODID_ADD_COURSE)))
          .addMethod(
            getDeleteCourseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.deleteCourseRequest,
                grpc.deleteCourseResponse>(
                  this, METHODID_DELETE_COURSE)))
          .addMethod(
            getIsRegisteredStudentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.isRegisteredStudentRequest,
                grpc.isRegisteredStudentResponse>(
                  this, METHODID_IS_REGISTERED_STUDENT)))
          .addMethod(
            getIsRegisteredCourseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.isRegisteredCourseRequest,
                grpc.isRegisteredCourseResponse>(
                  this, METHODID_IS_REGISTERED_COURSE)))
          .addMethod(
            getAddReservationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.addReservationRequest,
                grpc.addReservationResponse>(
                  this, METHODID_ADD_RESERVATION)))
          .addMethod(
            getValidateLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                grpc.validateLoginRequest,
                grpc.validateLoginResponse>(
                  this, METHODID_VALIDATE_LOGIN)))
          .build();
    }
  }

  /**
   */
  public static final class EnrolmentServiceStub extends io.grpc.stub.AbstractAsyncStub<EnrolmentServiceStub> {
    private EnrolmentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnrolmentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnrolmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllStudentData(grpc.Empty request,
        io.grpc.stub.StreamObserver<grpc.getAllStudentDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllStudentDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllCourseData(grpc.Empty request,
        io.grpc.stub.StreamObserver<grpc.getAllCourseDataResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllCourseDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addStudent(grpc.addStudentRequest request,
        io.grpc.stub.StreamObserver<grpc.addStudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteStudent(grpc.deleteStudentRequest request,
        io.grpc.stub.StreamObserver<grpc.deleteStudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCourse(grpc.addCourseRequest request,
        io.grpc.stub.StreamObserver<grpc.addCourseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCourse(grpc.deleteCourseRequest request,
        io.grpc.stub.StreamObserver<grpc.deleteCourseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isRegisteredStudent(grpc.isRegisteredStudentRequest request,
        io.grpc.stub.StreamObserver<grpc.isRegisteredStudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsRegisteredStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isRegisteredCourse(grpc.isRegisteredCourseRequest request,
        io.grpc.stub.StreamObserver<grpc.isRegisteredCourseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsRegisteredCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addReservation(grpc.addReservationRequest request,
        io.grpc.stub.StreamObserver<grpc.addReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateLogin(grpc.validateLoginRequest request,
        io.grpc.stub.StreamObserver<grpc.validateLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateLoginMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EnrolmentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<EnrolmentServiceBlockingStub> {
    private EnrolmentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnrolmentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnrolmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public grpc.getAllStudentDataResponse getAllStudentData(grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllStudentDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.getAllCourseDataResponse getAllCourseData(grpc.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllCourseDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.addStudentResponse addStudent(grpc.addStudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.deleteStudentResponse deleteStudent(grpc.deleteStudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.addCourseResponse addCourse(grpc.addCourseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.deleteCourseResponse deleteCourse(grpc.deleteCourseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.isRegisteredStudentResponse isRegisteredStudent(grpc.isRegisteredStudentRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsRegisteredStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.isRegisteredCourseResponse isRegisteredCourse(grpc.isRegisteredCourseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsRegisteredCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.addReservationResponse addReservation(grpc.addReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public grpc.validateLoginResponse validateLogin(grpc.validateLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateLoginMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EnrolmentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<EnrolmentServiceFutureStub> {
    private EnrolmentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnrolmentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EnrolmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.getAllStudentDataResponse> getAllStudentData(
        grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllStudentDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.getAllCourseDataResponse> getAllCourseData(
        grpc.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllCourseDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.addStudentResponse> addStudent(
        grpc.addStudentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.deleteStudentResponse> deleteStudent(
        grpc.deleteStudentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.addCourseResponse> addCourse(
        grpc.addCourseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.deleteCourseResponse> deleteCourse(
        grpc.deleteCourseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.isRegisteredStudentResponse> isRegisteredStudent(
        grpc.isRegisteredStudentRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsRegisteredStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.isRegisteredCourseResponse> isRegisteredCourse(
        grpc.isRegisteredCourseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsRegisteredCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.addReservationResponse> addReservation(
        grpc.addReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<grpc.validateLoginResponse> validateLogin(
        grpc.validateLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateLoginMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_ALL_STUDENT_DATA = 0;
  private static final int METHODID_GET_ALL_COURSE_DATA = 1;
  private static final int METHODID_ADD_STUDENT = 2;
  private static final int METHODID_DELETE_STUDENT = 3;
  private static final int METHODID_ADD_COURSE = 4;
  private static final int METHODID_DELETE_COURSE = 5;
  private static final int METHODID_IS_REGISTERED_STUDENT = 6;
  private static final int METHODID_IS_REGISTERED_COURSE = 7;
  private static final int METHODID_ADD_RESERVATION = 8;
  private static final int METHODID_VALIDATE_LOGIN = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnrolmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnrolmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_ALL_STUDENT_DATA:
          serviceImpl.getAllStudentData((grpc.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.getAllStudentDataResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_COURSE_DATA:
          serviceImpl.getAllCourseData((grpc.Empty) request,
              (io.grpc.stub.StreamObserver<grpc.getAllCourseDataResponse>) responseObserver);
          break;
        case METHODID_ADD_STUDENT:
          serviceImpl.addStudent((grpc.addStudentRequest) request,
              (io.grpc.stub.StreamObserver<grpc.addStudentResponse>) responseObserver);
          break;
        case METHODID_DELETE_STUDENT:
          serviceImpl.deleteStudent((grpc.deleteStudentRequest) request,
              (io.grpc.stub.StreamObserver<grpc.deleteStudentResponse>) responseObserver);
          break;
        case METHODID_ADD_COURSE:
          serviceImpl.addCourse((grpc.addCourseRequest) request,
              (io.grpc.stub.StreamObserver<grpc.addCourseResponse>) responseObserver);
          break;
        case METHODID_DELETE_COURSE:
          serviceImpl.deleteCourse((grpc.deleteCourseRequest) request,
              (io.grpc.stub.StreamObserver<grpc.deleteCourseResponse>) responseObserver);
          break;
        case METHODID_IS_REGISTERED_STUDENT:
          serviceImpl.isRegisteredStudent((grpc.isRegisteredStudentRequest) request,
              (io.grpc.stub.StreamObserver<grpc.isRegisteredStudentResponse>) responseObserver);
          break;
        case METHODID_IS_REGISTERED_COURSE:
          serviceImpl.isRegisteredCourse((grpc.isRegisteredCourseRequest) request,
              (io.grpc.stub.StreamObserver<grpc.isRegisteredCourseResponse>) responseObserver);
          break;
        case METHODID_ADD_RESERVATION:
          serviceImpl.addReservation((grpc.addReservationRequest) request,
              (io.grpc.stub.StreamObserver<grpc.addReservationResponse>) responseObserver);
          break;
        case METHODID_VALIDATE_LOGIN:
          serviceImpl.validateLogin((grpc.validateLoginRequest) request,
              (io.grpc.stub.StreamObserver<grpc.validateLoginResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EnrolmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnrolmentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return grpc.Enrollment.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnrolmentService");
    }
  }

  private static final class EnrolmentServiceFileDescriptorSupplier
      extends EnrolmentServiceBaseDescriptorSupplier {
    EnrolmentServiceFileDescriptorSupplier() {}
  }

  private static final class EnrolmentServiceMethodDescriptorSupplier
      extends EnrolmentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnrolmentServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (EnrolmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnrolmentServiceFileDescriptorSupplier())
              .addMethod(getGetAllStudentDataMethod())
              .addMethod(getGetAllCourseDataMethod())
              .addMethod(getAddStudentMethod())
              .addMethod(getDeleteStudentMethod())
              .addMethod(getAddCourseMethod())
              .addMethod(getDeleteCourseMethod())
              .addMethod(getIsRegisteredStudentMethod())
              .addMethod(getIsRegisteredCourseMethod())
              .addMethod(getAddReservationMethod())
              .addMethod(getValidateLoginMethod())
              .build();
        }
      }
    }
    return result;
  }
}
