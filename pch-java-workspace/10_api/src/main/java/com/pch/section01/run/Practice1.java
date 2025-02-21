package com.pch.section01.run;

public class Practice1 {
    public static void main(String[] args) {
        // localhost    : 서버의 IP 주소(단, localhost는 현재 본인 pc를 지칭)
        // 8888         : 포트번호
        // /app         : 애플리케이션을 지칭하는 contextPath
        // /signin.do   : 해당 어플리케이션의 로그인 서비스를 요청하는 url mapping 값
        String url = "https://localhost:8888/app/signin.do";
        String ctxPath = "/app";

        String []sArr = url.split("/");
        for(String s : sArr) {
            System.out.println(s);
        }

        System.out.println("포트번호: "+ sArr[2].split(":")[1]);
        System.out.println("서비스 mapping: "+sArr[sArr.length-1]);
    }
}
