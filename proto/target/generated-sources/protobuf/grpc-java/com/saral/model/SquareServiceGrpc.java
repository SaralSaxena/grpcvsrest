package com.saral.model;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.22.1)",
    comments = "Source: square.proto")
public final class SquareServiceGrpc {

  private SquareServiceGrpc() {}

  public static final String SERVICE_NAME = "saral.SquareService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.saral.model.Input,
      com.saral.model.Output> getFindSquareUnaryMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findSquareUnary",
      requestType = com.saral.model.Input.class,
      responseType = com.saral.model.Output.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.saral.model.Input,
      com.saral.model.Output> getFindSquareUnaryMethod() {
    io.grpc.MethodDescriptor<com.saral.model.Input, com.saral.model.Output> getFindSquareUnaryMethod;
    if ((getFindSquareUnaryMethod = SquareServiceGrpc.getFindSquareUnaryMethod) == null) {
      synchronized (SquareServiceGrpc.class) {
        if ((getFindSquareUnaryMethod = SquareServiceGrpc.getFindSquareUnaryMethod) == null) {
          SquareServiceGrpc.getFindSquareUnaryMethod = getFindSquareUnaryMethod = 
              io.grpc.MethodDescriptor.<com.saral.model.Input, com.saral.model.Output>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "saral.SquareService", "findSquareUnary"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saral.model.Input.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.saral.model.Output.getDefaultInstance()))
                  .setSchemaDescriptor(new SquareServiceMethodDescriptorSupplier("findSquareUnary"))
                  .build();
          }
        }
     }
     return getFindSquareUnaryMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SquareServiceStub newStub(io.grpc.Channel channel) {
    return new SquareServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SquareServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new SquareServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SquareServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new SquareServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class SquareServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void findSquareUnary(com.saral.model.Input request,
        io.grpc.stub.StreamObserver<com.saral.model.Output> responseObserver) {
      asyncUnimplementedUnaryCall(getFindSquareUnaryMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindSquareUnaryMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.saral.model.Input,
                com.saral.model.Output>(
                  this, METHODID_FIND_SQUARE_UNARY)))
          .build();
    }
  }

  /**
   */
  public static final class SquareServiceStub extends io.grpc.stub.AbstractStub<SquareServiceStub> {
    private SquareServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SquareServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SquareServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SquareServiceStub(channel, callOptions);
    }

    /**
     */
    public void findSquareUnary(com.saral.model.Input request,
        io.grpc.stub.StreamObserver<com.saral.model.Output> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindSquareUnaryMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SquareServiceBlockingStub extends io.grpc.stub.AbstractStub<SquareServiceBlockingStub> {
    private SquareServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SquareServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SquareServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SquareServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.saral.model.Output findSquareUnary(com.saral.model.Input request) {
      return blockingUnaryCall(
          getChannel(), getFindSquareUnaryMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SquareServiceFutureStub extends io.grpc.stub.AbstractStub<SquareServiceFutureStub> {
    private SquareServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private SquareServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SquareServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new SquareServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.saral.model.Output> findSquareUnary(
        com.saral.model.Input request) {
      return futureUnaryCall(
          getChannel().newCall(getFindSquareUnaryMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_SQUARE_UNARY = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SquareServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SquareServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_SQUARE_UNARY:
          serviceImpl.findSquareUnary((com.saral.model.Input) request,
              (io.grpc.stub.StreamObserver<com.saral.model.Output>) responseObserver);
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

  private static abstract class SquareServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SquareServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.saral.model.Square.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SquareService");
    }
  }

  private static final class SquareServiceFileDescriptorSupplier
      extends SquareServiceBaseDescriptorSupplier {
    SquareServiceFileDescriptorSupplier() {}
  }

  private static final class SquareServiceMethodDescriptorSupplier
      extends SquareServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SquareServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (SquareServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SquareServiceFileDescriptorSupplier())
              .addMethod(getFindSquareUnaryMethod())
              .build();
        }
      }
    }
    return result;
  }
}
