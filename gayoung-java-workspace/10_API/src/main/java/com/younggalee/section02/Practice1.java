package com.younggalee.section02;

public class Practice1 {
    public static void main(String[] args) {

        //localhost : 서버의 ip주소 (현재본인 PC 지칭)
        String url = "http://localhost:8888/app/signin.do";
        // /app : 어플리케이션을 지칭하는 contextPath
        // /signin.do : 해당 어플리케이션의 로그인 서비스를 요청하는 url mapping 값

        String ctxPath = "/app";


        System.out.println("포트번호: " + url.substring(url.lastIndexOf(":") + 1,url.indexOf(ctxPath)));
        System.out.println("서비스 mapping: " + url.substring(url.indexOf(ctxPath) + ctxPath.length()));


    }

}

