package section02.string;

public class Application4 {
    public static void main(String[] args) {
        /**
         * java.lang.StringBuffer
         * java.lang.StringBuilder
         * -가변 클래스
         * -변경이 빈번할 경우
         * - 메서드체이닝 가능
         *
         * Builder vs Buffer 차이점
         * - Builder 동기화 o
         * 동기화 : 하나의 자원에 대해 여러 스레드가 접근하려 할 때 한 시점에 하나의 스레드만 사용할 수 있도록 하는 것
         * 멀티스레드 : 여러개의 일처리가 동싣발적으로 수행되는 환경 - 동기화되어야 안전
         *
         - String은 불변클ㄹ래스이다.
         * String 은 변경이 빈번할 경우 매번 새로운 곳을 참조학 때문에 GC가 매번 삭제해야됨.
         *
         *
         */


//        String str = "반가워";
//        System.out.println(System.identityHashCode(str));
//
//        str += "난 string";
//        System.out.println(System.identityHashCode(str));
        /**
         * String은 동일한 값일 경우 재사용한다고 하였는데
         * +=하게되면 결국에는 기존 문자열과 달라지고, 새로운 문자열을 생성하야한다.
         */

        /*
        StringBuilder sb = new StringBuilder("반가워!"); // 16개의 문자를 기록할 수 있는 버퍼가 생성 + 글자수만큼

        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity()); //수용량
        System.out.println(sb.length());



        sb.append("아녕");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb)); //문자열을 추가해도 주소값은 여전히 동일하다
        System.out.println(sb.capacity()); //수용량
        System.out.println(sb.length());


        sb.append("111111111111111"); //수용량을 넘어갈 경우 더 크게 업데이트됨
        System.out.println(sb);
        System.out.println(sb.capacity()); //수용량
        System.out.println(sb.length());


        sb.delete(2,5);

        sb.insert(0,"추가");

        sb.reverse();

        sb.reverse().delete(0,2).insert(sb.length(),"wefwfwefwefwefwf"); //메서드체이닝
        System.out.println(sb);


        String result = sb.toString(); //StringBuilder -> String

        System.out.println(System.identityHashCode(sb));
        System.out.println(System.identityHashCode(result));

         */

        Application4 app = new Application4();
        app.tString();
        app.tStringBuilder();

    }

    public void tString(){
        char[] cl = "wadawdjaoiwejfoaijwefoiajp;efij;aoiewfj".toCharArray();
        String result = "";

        long start = System.nanoTime();
        for(int i = 0; i < cl.length; i++){
            result += cl[i];
        }
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    public void tStringBuilder(){
        char[] cl = "wadawdjaoiwejfoaijwefoiajp;efij;aoiewfj".toCharArray();
        StringBuilder sb = new StringBuilder();

        long start = System.nanoTime();
        for(int i = 0; i < cl.length; i++){
            sb.append(cl[i]);
        }

        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
