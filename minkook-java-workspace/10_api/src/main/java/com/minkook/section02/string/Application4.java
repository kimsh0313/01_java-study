package com.minkook.section02.string;

public class Application4 {
    public static void main(String [] args){
        /*
            문자열을 관리하는 클래스 3가지
            
            ## java.lang.String ##
            1. 클래스지만 기본자료형 사용법 처럼 쓸 수 있음
            
            ## java.lang.StringBuilder
            1. 인스턴스를 생성한 후 메소드를 활용하여 사용해야됨
            2. 불변클래스(Immutable)
            3. 변경이 빈번할 경우 매번 새로운곳을 참조하게 됨 매번 삭제해야함
             -> 조회용으로 사용
         */

        /*
            ## java.lang.StringBuilder|StringBuffer ##
            1. 인스턴스를 생성한 후 메소드를 활용하여 사용해야 함
            2. 가변 클래스
                : 기존에 참조하던 곳에서 변경 가능
            3. 변경이 빈번할 경우 사용하면 좋음
            4. 변경용 메소드를 메소드체이닝을 통해 사용할 수 있음
            5. StringBuilder StringBuffer의 차이점(동기화 제공야부)
                동기화 : 하나의 자원에 대해 여러 스레드가 접근하려 할때 
                    한 시점에 하나의 스레드만 사용가능
                    
                   > StringBuilder 동기화 제공 x => 속도가 빠름
                   > StringBuffer 동기화 제공 o => 속도가 느림

                   멀티스레드환경(여러개의 일처리가 동시다발적으로 수행되는 환경)
                        :동기화가 제공되는걸로 해야 안전 => StringBuffer

                   단일스레드환경(한번에 하나의 일만 처리하는 환경)
                        :동기화 필요없음(되려 동기화 제공되면 속도 저하) => String Builder
            
         */

        String str = "반가워!";
        System.out.println(System.identityHashCode(str));
        System.out.println(str);

        str += "난 String이야";
        System.out.println(System.identityHashCode(str));
        System.out.println(str);
        
        // 주소값이 달라짐 == 새로운곳을 참조 == 기존에 참조하던건 GC가 언젠간  지워줌


        //StringBuilder

        StringBuilder sb = new StringBuilder();

        sb.append("안녕!");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity());
        System.out.println(sb.toString());


        sb.append("안녕하세요!");
        System.out.println(System.identityHashCode(sb));
        System.out.println(sb.capacity());
        System.out.println(sb.toString());
        
        
    }
}
