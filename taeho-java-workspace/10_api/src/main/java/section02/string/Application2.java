package section02.string;

import java.util.StringTokenizer;

/*
    StringTokenizer
    분리된 문자열들을 1회성 토큰으로 관리할 때 사용
    countTokens() = 토큰의 개수 확인
    nextToken() = 토큰을 앞에서 하나씩 출력
    hasMoreTokens() = 토큰이 있는지 확인
 */
public class Application2 {
    public static void main(String[] args) {

        String str = "Java,MySQL,MyBatis,Front,Spring";
//        String[] strArr = str.split(",");
        StringTokenizer st = new StringTokenizer(str, ",");
//        System.out.println(st.countTokens());
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
//        System.out.println(st.nextToken());
//        if (st.hasMoreTokens()) {
//            System.out.println(st.nextToken());
//        }else{
//            System.out.println("No more tokens");
//        }

        for (int i = 0; i < st.countTokens(); i++) {
            System.out.println(st.nextToken());
        }
    }
}
