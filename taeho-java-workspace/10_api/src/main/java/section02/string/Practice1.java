package section02.string;

public class Practice1 {
    public static void main(String[] args) {
        String url = "http://localhost:8888/app/signin.do";
        String ctxPath = "/app";

        System.out.println("포트번호: " + url.substring(url.lastIndexOf(":")+1,url.indexOf(ctxPath)));
        System.out.println("서비스 mapping: " + url.substring(url.indexOf(ctxPath)+ctxPath.length()));

    }
}
