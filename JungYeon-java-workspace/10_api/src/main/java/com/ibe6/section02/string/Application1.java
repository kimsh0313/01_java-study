package com.ibe6.section02.string;

public class Application1 {
    public static void main(String[] args) {

        // * length() : 문자열의 길이(글자수) 반환
        String str1 = "hello";
        System.out.println("length() : " + str1.length());

        // * charAt(int) : 문자열로부터 인자로 전달된 인덱스 자리의 문자 반환
        System.out.println("charAt() : " + str1.charAt(2));

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";

        /*
         * compareTo(String) : 인자로 전달된 문자열과 사전순으로 비교하여 정수 반환

         */
        System.out.println("compareTo() : " + str2.compareTo(str3)); // 0 (같음)

        System.out.println("compareTo() : " + str2.compareTo(str4)); // 32 (인자로 전달된 문자열이 더 작다)
        System.out.println("compareTo() : " + str4.compareTo(str2)); // -32 (위의 반대)

        // jklmo
        System.out.println("compareTo() : " + str2.compareTo(str5)); // -5
        System.out.println("compareTo() : " + str5.compareTo(str2)); // 5

        // * compareToIgnoreCase(String) : compareTo와 동일하나 대소문자를 구분하지 않고 비교하여 반환
        System.out.println("compareToIgnoreCase() : " + str2.compareToIgnoreCase(str4)); // 0

        // * equals(Object) : 기존 문자열과 인자로 전달된 문자열이 일치하는지 비교 후 반환
        // * equalsIgnoreCase(String) : equals와 동일하나 대소문자를 구분하지 않고 비교 후 반환
        System.out.println("equals() : " + str2.equals(str4));      // false
        System.out.println("equalsIgnoreCase() : " + str2.equalsIgnoreCase(str4)); // true

        // * concat(String) : 기준 문자열에 인자로 전달된 문자열을 합친 새로운 문자열을 반환 (원본 문자열에 영향 x)
        System.out.println("concat() : " + str2.concat(str5));  // javaoracle
        System.out.println("str2 : " + str2);

        // * indexOf(String)     : 인자로 전달된 문자열을 앞에서부터 탐색해서 처음 일치하는 인덱스 위치 반환 (없으면 -1 반환)
        // * lastIndexOf(String) : 인자로 전달된 문자열을 뒤에서부터 탐색해서 처음 일치하는 인덱스 위치 반환 (없으면 -1 반환)
        String idxStr = "Hello World";
        System.out.println("indexOf(l) : " + idxStr.indexOf("l"));              // 2
        System.out.println("lastIndexOf() : " + idxStr.lastIndexOf("l"));   // 9
        System.out.println("indexOf(lo) : " + idxStr.indexOf("lo"));            // 3
        System.out.println("indexOf(a) : " + idxStr.indexOf("a"));              // -1

        // * substring : 문자열의 특정범위의 문자열을 반환 (원본 영향 x)
        // > substring(int beginIndex) : 시작인덱스부터 문자열의 끝까지를 반환
        // > substring(int beginIndex, int endIndex) : 시작인덱스부터 끝인덱스 이전까지를 반환
        System.out.println("substring(6) : " + idxStr.substring(6));
        System.out.println("substring(0, 4) : " + idxStr.substring(0, 4)); // 0<= < 4

        // * toUpperCase() : 문자열을 대문자로 변경한 새로운 문자열 반환 (원본 영향 x)
        // * toLowerCase() : 문자열을 소문자로 변경한 새로운 문자열 반환 (원본 영향 x)
        System.out.println("toUpperCase() : " + idxStr.toUpperCase());
        System.out.println("toLowerCase() : " + idxStr.toLowerCase());

        // > CharSequence : String 클래스가 구현하고 있는 부모 인터페이스
        // * contains(CharSequence) : 인자로 전달된 문자열이 포함되어 있을 경우 true 반환
        // * startsWith(String)     : 인자로 전달된 문자열로 시작할 경우 true 반환
        // * endsWith(String)       : 인자로 전달된 문자열로 끝날 경우 true 반환
        String email = "user01@naver.com";

        System.out.println("startsWith(user) : " + email.startsWith("user"));
        System.out.println("startsWith(admin) : " + email.startsWith("admin"));
    }
}
