package com.seungjoo.section03.example3;

public interface UserService {

    //회원등록 서비스
    void registerUser(String name, int age);
    //로그인 서비스
    void singingUser(String id, String pwd);

    //회원 정보 변경 서비스
    void modifyUser(String id, String name, int age);
}
