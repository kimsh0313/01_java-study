package section02.string;

public class Application3 {
    public static void main(String[] args) {
        /**
         * String Constant Pool(상수풀) 이라는 Heap 영역 공간에 바로 저장
         * 기존에 이미 동일한 문자열이 존재한다면 재사용함.
         * => 싱글톤처럼 관리된다,
         * => 문자열이 같으면 레퍼런스가 달라도 주소값이 같다.
         */
        String str = "Hello World";
        String str2 = "Hello World";

        String str3 = new String("Hello World");
        String str4 = new String("Hello World");

        /**
         * String 은 equals 와 hashcode가 오버라이딩으로 재정의 되어있다.
         */
        System.out.println(str == str2);
        System.out.println(str.equals(str2));
        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());

        /**
         * new String으로 선언한 변수는 다르다.
         */
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));

    }
}
