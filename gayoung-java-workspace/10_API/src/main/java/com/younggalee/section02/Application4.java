package com.younggalee.section02;


//스트링빌더, 버퍼
public class Application4 {
    public static void performanceTest_String(){
        char[] alphabet = "asdfsdfasdf".toCharArray(); // {'a', 's', 'd', ...}
        String result = "";

        long start = System.nanoTime(); //현재시간을 nano초로 출력해줌 (전)

        for (int i=0; i<alphabet.length; i++){
            result += alphabet[i];
        }

        long end = System.nanoTime(); // 후
        System.out.println(end - start);
        System.out.println(result);
    }


    public static void main(String[] args) {
        /*
            문자열을 관리하는 클래스 3가지

            1. java.lang.String
            - 클래스지만 기본자료형 사용법처럼 쓸 수 있음
            - 불변클래스(immutable)
              : 기존에 참조하던 곳에 변경 불가하다는 말 (변경시마다 새로운 곳을 참조하게 됨.) ***********
            - 변경이 빈번할 경우 매번 새로운 곳을 참조하게 되어서 GC가 매번 삭제해야됨.
               >> 조회용으로 쓰면 좋음

            2. java.lang.StringBuilder | StringBuffer
            - 인스턴스를 생성한 후, 메소드를 활용하여 사용해야됨.
            - 가변클래스
              : 기존에 참조하던 곳에서 변경 가능 ********************************
            - 변경이 빈번할 경우 사용하면 좋음. (변경시 활용할 수 있는 메소드가 다양함)
            - 변경용 메소드를 메소드체이닝을 통해 사용할 수 있음 (연속적으로 사용가능)
            * StringBuilder와 StringBuffer의 차이점 (동기화 제공여부)
               - 동기화 : 하나의 자원(데이터)에 대해 여러 스레드(일의 단위)가 접근하려 할 때
                          한 시점에 하나의 스레드만 사용할 수 있도록 하는 것
               >> StringBuilder : 동기화 제공 X (따라서 내부적 속도 빠름)
               >> StringBuffer : 동기화 제공 O  ( " 느림)

               멀티스레드 환경 (여러개의 일처리가 동시다발적으로 수행되는 환경)
                : 동기화가 제공되는 것으로 해야 안전 -> StringBuffer 사용 *****************

               단일스레드 환경 (한번에 하나의 일만 처리하는 환경)
                : 동기화가 필요없음 (되려 동기화가 제공되는걸로 하게되면 속도 저하) -> StringBuilder ********* 코테에서 이거 쓰면 됨.
         */

        // java.lang.String
        String str = "반가워";
        System.out.println(System.identityHashCode(str)); // 찐 주소값 확인

        str += "난 String이야";  //새롭게 할당됨 (str 주소값 갱신 : 새로운 곳을 참조)
        // 기존 참조하던 건 끊기고 언젠가 GC에 의해 삭제될 것임.
        System.out.println(System.identityHashCode(str));

        System.out.println("============================");

        // java.lang.StringBuilder
        // StringBuilder 객체 생성시 처음에 16개의 문자들을 기록할 수 있는 버퍼가 내부적으로 생성
        StringBuilder sb = new StringBuilder("반가워!"); //기본 생성하면 16, 내부에 작성하면 해당 글자만큼 추가적으로 생성 + 4글자

        System.out.println(sb); // 얘도 재정의 되어있음 (toString 생략)
        System.out.println(System.identityHashCode(sb)); // 찐 주소값 확인
        System.out.println(sb.capacity()); // 수용량 16 + 4 : 20
        System.out.println(sb.length()); // 문자열길이

        System.out.println("============");

        // append(String) : 기존에 문자열 뒤에 인자로 전달된 새 문자열이 추가됨, 현재의 StringBuilder 주소값 반환
        sb.append("안녕");
        // 변경 후
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb)); //새로운거 참조하지 않음 >> 가변클래스
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        // delete(int, int) : 기존의 문자열로부터 Start <=   < end범위의 문자열을 제거함. 현재 StringBuilder 주소값 반환
        sb.delete(2,5); // 수정됨
        System.out.println(sb);
        // insert(int, String) : 인자로 전달된 인덱스 위치에 전달된 문자열 추가, 현재 StringBuilder 주소값 반환
        sb.insert(1,"ㅎㅎㅎ");
        System.out.println(sb);
        // reverse() : 기존문자열을 역순으로 바꿔줌
        sb.reverse();
        System.out.println(sb);

        System.out.println("==============");
        // 메소드 체이닝
        sb.append("ㅋㅋㅋ").delete(0,4).reverse().insert(2, "!!");

        String result = sb.toString();
        System.out.println(sb);
        System.out.println(result);
        performanceTest_String();
        performanceTest_StringBuilder();

    }

    public static void performanceTest_StringBuilder(){
        char[] alphabet = "asdfsdfasdf".toCharArray(); // {'a', 's', 'd', ...}
        StringBuilder sb = new StringBuilder();

        long start = System.nanoTime();  // *************
        for (int i=0; i<alphabet.length; i++){
            sb.append(alphabet[i]);
        }
        long end = System.nanoTime();
        System.out.println(end - start);
        System.out.println(sb);
    }


}
