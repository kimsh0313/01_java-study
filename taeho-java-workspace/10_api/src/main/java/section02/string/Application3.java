package section02.string;

/*
    문자열 리터럴
    - String Constant Pool(상수풀) 영역에 저장됨
    - 상수풀에 이전 문자열리터럴과 동일한 문자열 리터럴이 발생될 경우,
        기존의 문자열리터럴을 재사용 (싱글톤 처럼 관리)
 */
public class Application3 {
    public static void main(String[] args) {
        String str = new String("Hello World");
        String str2 = new String("Hello World");

        System.out.println(str.hashCode());
        System.out.println(str2.hashCode());

        //주소값 비교
        System.out.println(str == str2);
        // 실제값 비교
        System.out.println(str.equals(str2));

        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

    }
}
