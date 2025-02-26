package section02.string;

public class practice1 {
    public static void main(String[] args) {

        //localhost : 본인 컴퓨터의 ip주소
        //8888 : 포트번호
        // /app : 애플리케이션을 지칭하는 contextPath
        //signin.do : 매핑값
        String url = "https://localhost:8888/app/signin.do";
        String stxPAth = "/app";


        System.out.println(url.substring(url.indexOf("localhost:") + "localhost:".length(), url.indexOf(stxPAth)));
        System.out.println(url.split("/")[4]);


        System.out.println(url.substring(url.lastIndexOf(":") + 1, url.indexOf(stxPAth)));
    }
}
