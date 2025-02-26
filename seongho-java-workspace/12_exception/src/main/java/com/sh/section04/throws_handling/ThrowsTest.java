package com.sh.section04.throws_handling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsTest {
/*
throws
발생되는 예외를 위임(떠넘기기, 던지기)하는 예외회피 방법
해당 메소드를 호출하는 곳으로 예외를 던지는 방식

public 반환타입 메소드명(매개변수)
 */
    public void exceptionCass() throws IOException{
        //사용자에게 문자열을 입력받아 출력

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력하시오~: ");
//        try {
//            String str = br.readLine(); //IOException 예외 핸들링 필수 >try~catch로 해결하거나 throws로 넘기기
//
//        }catch (IOException e){
//            //처리내용
//        }
        String str = br.readLine(); //IOException 예외 핸들링 필수 >try~catch로 해결하거나 throws로 넘기기
    }
}
