package com.inyong.section03.example3;

public interface UserService {
    // 회원 등록 서비스
    // 로그인 서비스
    // 회원 정보 변경 서비스

    void registerUser(String name, int age);

    void sigininUser(String id, String pwd);

    void modifyUser(String id, String name, int age);


}
