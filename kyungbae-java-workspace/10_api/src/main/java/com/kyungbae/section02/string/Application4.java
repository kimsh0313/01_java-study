package com.kyungbae.section02.string;

public class Application4 {
    public static void main(String[] args) {

        String str = "반가워";
        System.out.println(System.identityHashCode(str));

        str += "난 String이야";
        System.out.println(System.identityHashCode(str));
        // hashCode 값이 변경됨
        // 기존 참조값에서 수정이 되는 것이 아닌 새로운 참조값에 새로운 문자열을 생성

        System.out.println("==================================");

        // StingBulder 객체 생성시 처음에 16개의 문자들을 기록할 수 있는 버퍼가 내부적으로 생성
        StringBuffer sb = new StringBuffer("반가워"); // 16 + 3글자

        System.out.println("sb: " + sb/*.toString()*/); // toString() 오버라이딩 되어있음
        System.out.println("주소값: " + System.identityHashCode(sb));
        System.out.println("수용량: " + sb.capacity()); // 수용량 확인 (16 + 3 == 19)
        System.out.println("문자열의 길이: " + sb.length()); // 3

        // append(String) : 기존에 문자열 뒤에 인자로 전달된 새 문자열이 추가됨, 현재의 StringBuilder 주소값 반환
        sb.append(" 안녕!");
        System.out.println("변경 후 sb: " + sb);
        System.out.println("주소값: " + System.identityHashCode(sb)); // 변경후에도 주소값 동일
        System.out.println("수용량: " + sb.capacity()); // 수용량 확인 (16 + 3 == 19)
        System.out.println("문자열의 길이: " + sb.length()); // 7
        // 주소값 변경 없음 == 기존에 참조하던 곳에서 변경 발생 == 가변클래스

        System.out.println("==============================");

        sb.append("다들 조금만 힘내세요!!!!"); // 15
        System.out.println("sb: " + sb);
        System.out.println("주소값: " + System.identityHashCode(sb));
        System.out.println("수용량: " + sb.capacity()); // 기존의 수용량 * 2 + 2
        System.out.println("문자열의 길이: " + sb.length()); // 22

        System.out.println("==============================");

        // delete(int, int) : 기존의 문자열로부터 start <= 범위 < end 의 문자열을 제거함, 현재 StringBuilder 주소값 반환
        sb.delete(2,5); // 2 = 워 5 = 녕
        System.out.println("sb: " + sb);
        System.out.println("주소값: " + System.identityHashCode(sb));
        System.out.println("수용량: " + sb.capacity()); // 수용량이 다시 줄어들지 않고 보존 // 40
        System.out.println("문자열의 길이: " + sb.length()); // 19

        System.out.println("==============================");

        // insert(int, String) : 인자로 전달된 인덱스 위치에 전달된 문자열 추가됨, 현재 StringBuilder 주소값 반환
        sb.insert(1, "ㅎㅎㅎ");
        System.out.println("sb: " + sb);
        System.out.println("주소값: " + System.identityHashCode(sb));
        System.out.println("수용량: " + sb.capacity());
        System.out.println("문자열의 길이: " + sb.length());

        System.out.println("==============================");

        // reverse() : 기존의 문자열을 역순으로 바꿔줌, 현재 StringBuilder 주소값 반환
        sb.reverse();
        System.out.println("sb: " + sb);
        System.out.println("주소값: " + System.identityHashCode(sb));
        System.out.println("수용량: " + sb.capacity());
        System.out.println("문자열의 길이: " + sb.length());

        System.out.println("==============================");

        // 메소드 체이닝
        sb.append("ㅋㅋㅋ").delete(0,4).reverse().insert(2, "!!!!"); // 반환값이 StringBuilder 주소값이므로 메소드 체이닝 가능
        System.out.println(sb);

        String result = sb.toString(); // StringBuilder 타입을 toString() 으로 String 타입으로 변환
        System.out.println(result);

        System.out.println(sb.equals(result));
        System.out.println(sb.hashCode());
        System.out.println(result.hashCode());

        System.out.println("===============================");

        performanceTest_String();
        performaneTest_StringBuilder();

    }

    public static void performanceTest_String() {
        // String을 이용한 문자열 연결 (+ 연산자)

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        String result = "";
        long start = System.nanoTime(); // 현재 시간을 나노초 단위로 받아오기
        for (int i = 0; i < alphabet.length; i++) {
            result += alphabet[i]; // for문이 한번 돌때마다 새로운 String 값을 만들어서 저장한다
        }
        long end = System.nanoTime();

        System.out.println("String 결과 : " + result);
        System.out.println("걸린시간 : " + (end - start) + "ns");
    }

    public static void performaneTest_StringBuilder() {
        // StringBuilder를 이용한 문자열 연결 (append 메소드)

        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        StringBuilder sb = new StringBuilder();
        long start = System.nanoTime();
        for (int i = 0; i < alphabet.length; i++) {
            sb.append(alphabet[i]);
        }
        long end = System.nanoTime();

        System.out.println("StringBuilder 결과 : " + sb);
        System.out.println("소요시간 : " + (end - start) + "ns"); // 더 빠름

    }



}
