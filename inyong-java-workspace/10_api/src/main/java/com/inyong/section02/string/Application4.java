package com.inyong.section02.string;

public class Application4 {
    // java.lang.String

    /*
    - 클래스지만 기본 자료형 사용법 처럼 쓸 수 있음
    - 불변 클래스 (Immutable)
    - 변경이 빈번할 경우 매번 새로운 곳을 참조하게 되서 GC가 매번 삭제해야됨
    -> 조회용으로 쓰면 좋음


    ## java.lang.StringBuilder | String Buffer
    1. 인스턴스를 생성한 후 메소드를 활용하여 사용해야됨
    2. 가변클래스
     : 기존에 참조하던 곳에서 변경 가능
     3. 변경이 빈번할 경우 사용하면 좋음
     4. 변경용 메소드를 메소드체이닝을 통해 사용할 수 있음

     5. StringBuilder와 StringBuffer의 차이점 (동기화 제공여부)
     동기화 : 하나의 자원(데이터)에 대해 여러 스레드(일의 다누이)가 접근하려 할 때
            한 시점에 하나의 스레드만 사용할 수 있도록 하는 것

     > StringBuilder : 동기화 제공 X => 속도가 빠름
     > StringBuffer : 동기화 제공 o => 속도가 느림

     멀티스레드환경(여러개의 일처리가 동시다발적으로 수행되는 환경)
     : 동기화가 제공되는 걸로 해야 안전 => StringBuffer

     단일스레드환경(한번에 하나의 일만 처리하는 환경)  (동기화가 제공되는 것을 하게 되면 속도 저하)
     : 동기화가 필요없음 => StringBuilder
     */

    public static void main(String[] args) {
        String str = "반가와!";
        System.out.println(System.identityHashCode(str));

        str += "난 String이야!";
        System.out.println(System.identityHashCode(str));

        // 주소값이 달라짐 == 새로운 곳을 참조 == 기존에 참조하던 GC(가비지컬렉터)가 언젠간 지워줌
        StringBuilder sb = new StringBuilder();
        System.out.println("sb: " + sb/*.toString()*/);
        System.out.println("주소값" + System.identityHashCode(sb));
        System.out.println("수용량" + sb.capacity());
        System.out.println("문자열의 길이: " + sb.length());
        System.out.println("===========================");

        sb.append("안녕~!");
        System.out.println("sb: " + sb/*.toString()*/);
        System.out.println("주소값" + System.identityHashCode(sb));
        System.out.println("수용량" + sb.capacity());
        System.out.println("문자열의 길이: " + sb.length());
        System.out.println("===========================");

        sb.append("안녕가나다라마바사아자차카파타하!");
        System.out.println("sb: " + sb/*.toString()*/);
        System.out.println("주소값" + System.identityHashCode(sb));
        System.out.println("수용량" + sb.capacity()); // 모자라면 기존의 수용량 *2 + 2
        System.out.println("문자열의 길이: " + sb.length());
        System.out.println("===========================");

        //* delete(int, int) : 기존의 문자열로부터 start <= < end 범위의 문자열을 제거함,
        // 현재 StringBuilder 주소값 반환

        sb.delete(2, 5);

        System.out.println("변경후 Sb" + sb);
        System.out.println("주소값" + System.identityHashCode(sb));
        System.out.println("수용량" + sb.capacity());
        System.out.println("문자열의 길이: " + sb.length());
        System.out.println("===========================");

        //* insert(int, String) : 인자로 전달된 인덱스 위치에 전달된 문자열 추가됨, 현재 StringBuilder 주소값 반환
        sb.insert(1, "ㅎㅎㅎ");
        System.out.println("변경후 Sb" + sb);
        System.out.println("주소값" + System.identityHashCode(sb));
        System.out.println("수용량" + sb.capacity());
        System.out.println("문자열의 길이: " + sb.length());
        System.out.println("===========================");

        sb.reverse(); // 뒤집기
        System.out.println("변경후 Sb" + sb);
        System.out.println("주소값" + System.identityHashCode(sb));
        System.out.println("수용량" + sb.capacity());
        System.out.println("문자열의 길이: " + sb.length());
        System.out.println("===========================");

        sb.append("ㅎㅎㅎ").delete(0, 4).reverse();
        System.out.println("변경후 Sb" + sb);
        System.out.println("주소값" + System.identityHashCode(sb));
        System.out.println("수용량" + sb.capacity());
        System.out.println("문자열의 길이: " + sb.length());
        System.out.println("===========================");

        // 변경작업이 다 끝난 후에 String 타입으로 기록
        String result = sb.toString();
        System.out.println(result);


        performanceTest_String();
        performanceTest_StringBuilder();
    }

    public static void performanceTest_String() {
        char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String result = "";
        long start = System.nanoTime();
        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }
        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println("result : " + result);
    }

    public static void performanceTest_StringBuilder(){
        char[] a = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        StringBuilder sb = new StringBuilder();

        long start = System.nanoTime();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
        }

        long end = System.nanoTime();
        System.out.println(end-start);
        System.out.println(sb);


    }


}
