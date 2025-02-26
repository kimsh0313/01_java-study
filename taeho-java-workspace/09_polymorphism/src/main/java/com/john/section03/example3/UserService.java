package com.john.section03.example3;

public interface UserService {

    void registUser(String name, int age);

    void signUser(String id, String pwd);

    void modifyUser(String id, String name, int age);

}
