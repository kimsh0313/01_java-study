package com.inyong.section02.string;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        // * length() : 문자열 길이(글자수) 반환
        String str1 = "hello";
        System.out.println("length():" + str1.length());

        // * charAt(int) : 문자열로 부터 인자로 전달된 인덱스 자리의 문자 반환
        System.out.println("charAt() : " + str1.charAt(2));

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";


        /*
         compareTo(String) : 인자로 전달된 문자열과 사전순으로 비교(대소문자 구분)하여 정수 반환
                            기준이 되는 문자열 - 인자로 전달되는문자열
                            두 문자열이 같은경우 0 반환
                            더 클경우 음수
                            더 작을경우 양수
         */
        System.out.println("compareTo() :" + str2.compareTo(str4)); // 같을 경우
        System.out.println("compareTo() :" + str3.compareTo(str4)); // 32 (인자로 전달된 문자열이 더 작다) - 대문자 < 소문자
        System.out.println("compareTo() :" + str4.compareTo(str2)); //
        System.out.println("B".compareTo("A"));


        //* compareToIgnoreCase(String) : compareTo와 동일하나 대소문자 구분 하지 않음
        System.out.println("compareToIgnoreCase() :" + str2.compareToIgnoreCase(str4));

        // * equals (Object) : 기존에 문자열과 인자로 전달된 문자열이 일치하는지 비교 후 반환 (대소문자 비교)
        // * equalsIgnoreCare(String) : equals 와동일하나 대소문자를 구분하지 않고 비교 후 반환
        System.out.println("equals() : " + str2.equals(str4));
        System.out.println("equalsIgnoreCase() : " + str2.equalsIgnoreCase(str4));

        // * concat(String) : 기준 문자열에 인자로 전달된 문자열을 합친 새로운 문자열을 반환 (원본 문자열에 영향 x)
        System.out.println("concat() : " + str2.concat(str5));
        System.out.println("str2" + str2);

        // * indexOf(String) : 인자로 전달된 문자열을 "앞"에서부터 탐색해서 처음일치하는 인덱스 위치 반환 (없으면 -1)
        // * lastIndexOf(String) : 인자로 전달된 문자열을 "뒤에서 부터 탐색해서 처음 일치하는 인덱스 위치 반환 (없으면 -1)

        String idxStr = "Hello world";

        System.out.println("indexOf(l) : " + idxStr.indexOf("l"));
        System.out.println("lastIndexOf(l) : " + idxStr.lastIndexOf("l"));
        System.out.println("indexOf(lo) : " + idxStr.indexOf("lo"));
        System.out.println("indexOf(a) : " + idxStr.indexOf("a"));

        // * substring : 문자열의 특정범위의 문자열을 새롭게 반환 (원본 영향 x)
        // > substring(int beginIndex)
        // > substring(int beginidex, int endIndex) 이상, 미만

        System.out.println("substring(6) " + idxStr.substring(6));
        System.out.println("substring(0, 4) " + idxStr.substring(0, 4));

        // * toUpperCase() : 문자열을 대문자로 변경한 새로운 문자열 반환 (원본 영향 x);
        // * toLowerCase() : 문자열을 소문자로 변경한 새로운 문자열 반환 (원본 영향 x);

        System.out.println("toUpperCase() " + idxStr.toUpperCase());
        System.out.println("toLowerCase() " + idxStr.toLowerCase());

        // > CharSequence : String 클래스가 구현하고 있는 부모 인터페이스
        // * contains(CharSequence) : 인자로 전달된 문자열이 포함되어 있을 경우 true 반환
        // * startsWith(String) : 인자로 전달된 문자열로 시작할 경우 true 반환
        // * endsWith(String) : 인자로 전달된 문자열로 끝날 경우 true 반환

        String email = "user01@naver.com";
        System.out.println("startsWith(user) : " + email.startsWith("user"));
        System.out.println("startsWith(admin) : " + email.startsWith("admin"));

        System.out.println("endsWith(user) : " + email.endsWith(".com"));
        System.out.println("endsWith(admin) : " + email.endsWith(".kr"));

        System.out.println("contains(@) : " + email.contains("@"));

        //* replace (CharSequence, CharSequence) : 첫번째 인자 문자열을 찾아 두번째 문자열로 변환시킨 새 문자열 반환
        String ip = "102.168.0.202";
        System.out.println("replace(): " + ip.replace(".", "_"));

        // * trim() : 문자열의 앞과 뒤 공백을 제거한 새로운 문자열 반환
        String content = "\n 안녕하세요. 캥거루 입니다. \n";
        System.out.println("trim() : #" + content.trim() + "#");

        //* isEmpty() : 문자열이 빈문자열("")일 경우 true
        //* isBlank() : 문자열이 빈문자열("") 또는 공백문자열(" ")일 경우 true -> 버전 자바 11 추가 기능

        String empty = "";
        String blank = " ";
        System.out.println("isEmpty : " + empty.isEmpty());
        System.out.println("isBlank : " + blank.isBlank());


        // * split() : 인자로 전달된 문자열 기준으로 분리시켜 String[]에 담아 반환

        String lectures = "java,MySQL,MyBatis,Front,Spring";

        String[] lecArr = lectures.split(",");
        System.out.println(Arrays.toString(lecArr));

        // * static join(CharSequence, CharSequence... ) : static method
        // : 인자로 전달된 string[] 배열의 요소들을 특정 구분자와 함께 하나의 문자열로 연결시켜 반환

        String newStr = String.join("-", lecArr);
        System.out.println(newStr);

        // * toCharArray() : 문자열의 각 문자들을 char[]에 담아 반환
        char[] charArr = newStr.toCharArray();
        System.out.println(Arrays.toString(charArr));
        System.out.println("char[] 길이:" + charArr.length);
        System.out.println("1번 인덱스 :" + charArr[1]);


    }

}
