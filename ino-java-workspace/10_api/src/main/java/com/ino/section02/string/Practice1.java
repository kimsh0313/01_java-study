package com.ino.section02.string;

public class Practice1 {

    public static void main(String[] args) {

        // localhost :   서버 ip주소
        // 8888      : 포트 번호
        // /app      : app지칭 contextpath
        // /signin.do: 해당 애플리케이션 로그인 서비스 요청하는 url mapping 값

        String url = "http://localhost:8888/app/signin.do";
        String ctxPath = "/app";


        String[] portAndMapping = url.split(":")[2].split(ctxPath);
        System.out.println(portAndMapping[0]);
        System.out.println(portAndMapping[1]);
    }
}

