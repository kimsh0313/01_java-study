package section02.string;

/*
    문자열 관리 클래스
    String
        - 클래스이지만 기본자료형처럼 사용가능
        - 불변클래스: 기존에 참조하던 곳에서 변경불가(변경시마다 새로운 주소를 참조)

    StringBuilder | StringBuffer
        - 인스턴스를 생성한 후 메서드를 활용하여 사용
        - 가변 클래스: 기존에 참조하던 곳에서 변경 가능
        - 변경용 메서드를 메서드 체인을 통해 사용할 수 있음
        - StringBuilder 와 StringBuffer의 차이점: 동기화 제공 여부
            * 동기화: 하나의 자원(데이터) 에 대해 여러 스레드(일의 단위)가 접근하려할때
            한 시점에 하나의 스레드만 사용할 수 있돌고 하는 것
        > StringBuilder: 동기화 제공 X => 속도가 빠름 = 단일 스레드 환경(동기화 미필요)
        > StringBuffer: 동기화 제공 O => 속도가 느림 = 멀티 스레드 환경(동기화 필요)

 */
public class Application4 {
    public static void main(String[] args) {
        String str = "반갑소";
        System.out.println(System.identityHashCode(str));
        str += "String이라 하오";
        System.out.println(System.identityHashCode(str));

        System.out.println("=============================");


        // 객체 생성시 16개의 문자를 저장할 수 있는 버퍼가 내부적으로 생성
        StringBuffer sb = new StringBuffer("Hello!");

        System.out.println("sb: " + sb.toString());
        System.out.println("주소값: " + System.identityHashCode(str));
        System.out.println("수용량 : " + sb.capacity());
        System.out.println("문자열의 길이 : "+ sb.length());

        System.out.println("=============================");
        
        sb.append("주말이 다가온다~~~~~~~~~~~~~~~~~~~~");
                
        System.out.println("sb: " + sb.toString());
        System.out.println("주소값: " + System.identityHashCode(str));
        System.out.println("수용량 : " + sb.capacity());
        System.out.println("문자열의 길이 : "+ sb.length());

        System.out.println("=============================");

        sb.delete(2,5);

        System.out.println("sb: " + sb.toString());
        System.out.println("주소값: " + System.identityHashCode(str));
        System.out.println("수용량 : " + sb.capacity());
        System.out.println("문자열의 길이 : "+ sb.length());

        System.out.println("=============================");

        sb.insert(1,"rewr3");

        System.out.println("sb: " + sb.toString());
        System.out.println("주소값: " + System.identityHashCode(str));
        System.out.println("수용량 : " + sb.capacity());
        System.out.println("문자열의 길이 : "+ sb.length());

        System.out.println("=============================");

        sb.reverse();

        System.out.println("sb: " + sb.toString());
        System.out.println("주소값: " + System.identityHashCode(str));
        System.out.println("수용량 : " + sb.capacity());
        System.out.println("문자열의 길이 : "+ sb.length());

        System.out.println("=============================");

        sb.append("오오오").delete(0,4).reverse().insert(2,"일년에 한번뿐인");

        System.out.println("sb: " + sb.toString());
        System.out.println("주소값: " + System.identityHashCode(str));
        System.out.println("수용량 : " + sb.capacity());
        System.out.println("문자열의 길이 : "+ sb.length());

        String result = sb.toString();
        System.out.println(result);

        System.out.println("=============================");

        performanceTest_String();

        performanceTest_StringBuilder();
    }

    public static void performanceTest_String() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String result = "";

        long start = System.nanoTime();
        for (int i = 0; i < alphabet.length; i++) {
            result += alphabet[i];
        }
        long end = System.nanoTime();

        System.out.println("performanceTest_String: " + (end - start));
    }

    public static void performanceTest_StringBuilder() {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        StringBuilder result = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < alphabet.length; i++) {
            result.append(alphabet[i]);
        }
        long end = System.nanoTime();

        System.out.println("performanceTest_String: " + (end - start));
    }
}
