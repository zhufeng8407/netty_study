package com.zhufeng.grpc;

import com.zhufeng.proto.MyRequest;
import com.zhufeng.proto.MyResponse;
import com.zhufeng.proto.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;

public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase {

    @Override
    public void getRealUsername(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println("���յ��ͻ�����Ϣ�� " + request.getUsername());

        responseObserver.onNext(MyResponse.newBuilder().setRealname("����").build());

        responseObserver.onCompleted();
    }
}
