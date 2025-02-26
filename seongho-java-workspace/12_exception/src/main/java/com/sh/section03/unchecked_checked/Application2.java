package com.sh.section03.unchecked_checked;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Application2 {
    public static void main(String[] args)  {

        /*
        checked Exception
        1. 예외핸들링이 없으면 동작 안 됨
            ㄴ예외처리를 하지 않으면 컴파일 에러가 발생되기 때문에
        2. 예외 처리, 예외회피 둘 중 하나로 핸들링해야 됨 (조건문 안 됨)
        3. RuntimeException 클래스를 제외한 모든 예외 클래스
        -IOException
        -SqlException
         */
        try {
            new URL("https://www.google.com");

        }catch (MalformedURLException e){
            System.out.println("예외발생");
        }
        try {
            new File("test.txt").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
