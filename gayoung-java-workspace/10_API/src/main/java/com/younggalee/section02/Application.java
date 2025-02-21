package com.younggalee.section02;

import java.util.Arrays;

public class Application {
    public static void main(String[] args) {
        /*
            ## java.lang.String ##
            length() : 문자열의 길이(글자수) 반환
            charAt(int) : 문자열로부터 인자로 전달된 인덱스 자리의 문자 반환

         */

        String str1 = "java";
        String str2 = "java";
        String str3 = "JAVA";
        String str4 = "oracle";

        //compareTo(String) : 인자로 전달된 문자열과 사전순으로 비교(대소문자 구분)하여 정수 반환
                              // 기준이 되는 문자열 - 인자로 전달되는 문자열
                              // 두문자열이 같으면 : 0, 인자문자열이 더 크면 음수, 인자문자열이 더 작으면 양수 반환
        int result = str2.compareTo(str3);
        System.out.println(result);

        // compareToIgnoreCase(String) : compareTo와 동일하나 대소문자를 구분하지 않고 비교하여 반환

        int result2 = str2.compareToIgnoreCase(str3);
        System.out.println(result2);

        // equals(Object) : 기존 문자열과 인자로 전달된 문자열이 일치하는지 비교 후 반환
        // equalsIgnoreCase(String) : equals와 동일하나 대소문자를 구분하지 않고 비교 후 반환
        System.out.println(str3.equalsIgnoreCase(str2));

        // concat(String) : 기준 문자열에 인자로 전달된 문자열을 합친 새로운 문자열 반환 (원본 문자열에 영향X)
        // indexOf(String) : 인자로 전달된 문자열을 '앞'에서부터 탐색하여 처음 일치하는 인덱스 위치 반환 (없으면 -1)
        // lastIndexOf(String) : 인자로 전달된 문자열을 '뒤'에서부터 탐색하여 처음 일치하는 인덱스 위치 반환 (없으면 -1)
        System.out.println(str1.indexOf("av")); // 1   // 시작 인덱스가 출력
        //-1 인지 아닌지를 통해 해당문자열 들어있는지 확인 가능

        // substring : 문자열의 특정범위의 문자열을 반환 (원본 영향 x)
//        str1.substring();  //int : 시작인덱스
//        str1.substring();  // int int : 시작 <= ,  < 끝 인덱스

        // toUpperCase(), toLowerCase()  >> 문자열을 대,소문자로 변경한 새로운 문자열 반환 (원본 영향 X)


        // > CharSequence : String 클래스가 구현하고 있는 부모 인터페이스
        //contains(CharString) : 인자로 전달된 문자열이 포함되어 있을 경우 true반환
        // startsWith(String) : 인자문자열로 시작하면 true
        // endsWith(String) : 인자문자열로 끝나면 True

        // replace(CharSequence,CharSequence) : 첫번째 인자 문자열을 찾아 두번째 문자열로 변환시킨 새 문자열 반환
        String ip = "192.168.0.202";
        System.out.println("replace() : " + ip.replace(".", "_"));

        // trim() : 문자열 앞뒤 공백제거후 새로운 문자열 반환 (원본 영향X)
        // isEmpty() : 문자열이 빈문자열일 경우 true 반환
        // isBlank() : 문자열이 빈문자열("") 또는 공백문자열(" ")일 경우 true (java 11이상)

        // split(String) : 인자로 전달된 문자열을 기준으로 분리시켜 String[]에 담아 반환
        // static join(CharSequence, CharSequence ...) : 인자로 전달된 String[] 배열의 요소들을 특정 구분자와 함께 하나의 문자열로 연결시켜 반환
        String[] arr = {"a", "b", "c"};
        String newArr = String.join("-", arr);
        System.out.println(newArr);

        // toCharArray() : 문자열의 각 문자들을 char[]에 담아 반환
        char[] charArr = newArr.toCharArray();
        System.out.println(Arrays.toString(charArr));






    }
}
