package com.inyong.section02;

public class Practice1 {
    public static void main(String[] args) {
        //localhost: 서버의 ip 주소

        // /app : 애플리케이션을 지칭하는 contextPath


        String url = "http://localhost:8888/app/signin.do";
        String ctxPath = "/app";

        int port = url.lastIndexOf(':');
        System.out.println("포트번호" + url.substring(port + 1, url.indexOf(ctxPath)));


//        String[] slashPort = url.substring(port).split("/");
//        System.out.println("포트번호" + slashPort[0]);


        int path = url.indexOf(ctxPath);
        System.out.println("서비스 mapping: " + url.substring(path));
        System.out.println("서비스 mapping: " + url.substring(path + ctxPath.length()));


    }
}
