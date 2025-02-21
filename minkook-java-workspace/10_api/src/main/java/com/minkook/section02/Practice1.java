package com.minkook.section02;

import org.w3c.dom.ls.LSOutput;

public class Practice1 {


    public static void main(String [] args){
        //       localhost : 서버 ip 주소(단, localhost는 현재 본인 pc를 지칭)
        //       8888 : 포트번호
        //      /app : 애플리케이션을 지칭하는 contextPath
        //      /signin.do : 해당 애플리케이션의 로그인서비를 요청하는 url 매핑값
        String url = "http://localhost:8888/app/signin.do";
        String ctxPath = "/app";
        //System.out.println(url.lastIndexOf(":")); //16
        //System.out.println(url.lastIndexOf("/")); //25
        System.out.println(url.substring(url.lastIndexOf(":")+1,url.indexOf(ctxPath))); //8888
        System.out.println(url.substring(url.lastIndexOf("/")+1)); //signin.do
    }
}
