package com.jun.section02;

public class Practice1 {
    public static void main(String[] args) {

        // localhost : 서버의 ip주소(단, localhost는 현재 본인 pc를 지칭)
        // 8888      : 포트번호
        // /app      : 애플리케이션을 지칭하는 cintexPath
        // /signin.do: 해당 애플리케이션의 로그인 서비스를 요청하는 url mapping 값

        String url = "http://localtost:8888/app/signin.do";
        String ctxPath = "/app";



        System.out.println("포트번호:" + url.substring(url.lastIndexOf(":") + 1, url.indexOf(ctxPath))); // 8888
        System.out.println("서비스 mapping: " + url.substring(url.indexOf(ctxPath) + ctxPath.length() )); // /signin.do
    }
}
