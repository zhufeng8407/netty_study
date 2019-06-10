package com.zhufeng.grpc;

import com.zhufeng.proto.MyRequest;
import com.zhufeng.proto.MyResponse;
import com.zhufeng.proto.StudentServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {

    public static void main(String[] args) {
        ManagedChannel manageChannel = ManagedChannelBuilder.forAddress("localhost", 8899).usePlaintext().build();

        StudentServiceGrpc.StudentServiceBlockingStub blockingStub = StudentServiceGrpc
                .newBlockingStub(manageChannel);
        MyResponse myResponse = blockingStub.getRealUsername(MyRequest.newBuilder().setUsername("zhangsan").build());

        System.out.println(myResponse.getRealname());

    }
}
