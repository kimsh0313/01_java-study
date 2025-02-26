package com.seungjoo.section02.string;

public class practice1 {
    public static void main(String[] args) {

        String url = "https://localhost:8888/app/signin.do";

        //localhost : 서버의 ip주소 (단, localhost는 현재 본인 pc를 지정
        //8888 : 포트 번호
        //app : 애플리케이션을 지칭하는 contextPath
        // sigin.do : 해당 어플리케이션의 로그인 서비스를 요청하는 url mapping 값
        String ctxPath = "/app";


        //2개의 문자열을 가지고  포트번호를 구할 수 있게 해야함


        int index2 = url.indexOf("8");
        String str2 = url.substring(index2, index2+4);
        System.out.println("포트번호 " + str2);

        int index = url.indexOf(ctxPath);

        String str = url.substring(index+5);
        String strk = str.replace(".do", "");
        System.out.println("서비스 mapping: " + strk);



    }
}
