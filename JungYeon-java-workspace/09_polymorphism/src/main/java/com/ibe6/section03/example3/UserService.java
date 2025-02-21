package com.ibe6.section03.example3;

public interface UserService {

    // 회원등록서비스
    void registerUser(String name, int age);
    // 로그인서비스
    void sigininUser(String id, String pwd);
    // 회원정보변경서비스
    void modifyUser(String id, String name, int age);

    // 작업지시서 같은 개념

}