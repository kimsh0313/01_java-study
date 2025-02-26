package com.kyungbae.section03.example3;

public interface UserService {

    // 회원 등록 서비스
    void registerUser(String name, int age);
    // 로그인 서비스
    void siginUser(String id, String pwd);
    // 회원 정보 변경 서비스
    void modifyUser(String id, String name, int age);

    // 작업지시서 같은 개념

}
