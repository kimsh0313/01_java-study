package com.jjanggu.section02.string;

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
            * compareTo(String) : 인자로 전달된 문자열과 사전순으로 비교(대소문자 구분)하여 정수 반환
                                  기준이되는 문자열 - 인자로 전달되는 문자열
                                  => 두 문자열이 같을 경우 0 반환
                                  => 인자 문자열이 더 클 경우 음수 반환
                                  => 인자 문자열이 더 작을 경우 양수 반환
         */
        System.out.println("compareTo() : " + str2.compareTo(str3)); // 0 (같음)

        System.out.println("compareTo() : " + str2.compareTo(str4)); // 32 (인자로 전달된 문자열이 더 작다)
        System.out.println("compareTo() : " + str4.compareTo(str2)); // -32 (위의 반대)

        // jklmno
        System.out.println("compareTo() : " + str2.compareTo(str5)); // -5
        System.out.println("compareTo() : " + str5.compareTo(str2)); // 5

        // * compareToIgnoreCase(String) : compareTo와 동일하나 대소문자를 구분하지 않고 비교하여 반환
        System.out.println("compareToIgnoreCase : " + str2.compareToIgnoreCase(str4)); //0

        // * equals(Object) : 기존 문자열과 인자로 전달된 문자열이 일치하는지 비교 후 반환 (대소문자 구분)
        // * equalsIgnoreCase(String) : equals와 동일하나 대소문자를 구분하지 않고 비교 후 반환
        System.out.println("equals() : " + str2.equals(str4)); // false
        System.out.println("equalsIgnoreCase() : " + str2.equalsIgnoreCase(str4)); // true

        // * concat(String) : 기준 문자열에 인자로 전달된 문자열을 합친 새로운 문자열을 반환 (원본 문자열에 영향 X)
        System.out.println("concat() : " + str2.concat(str5)); //javaoracle
        System.out.println("str2 : " + str2);

        // * indexOf(String)     : 인자로 전달된 문자열을 "앞"에서부터 탐색해서 처음 일치하는 인덱스 위치 반환 (없으면 -1 반환)
        // * lastIndexOf(String) : 인자로 전달된 문자열을 "뒤"에서부터 탐색해서 처음 일치하는 인덱스 위치 반환 (없으면 -1 반환)
        String idxStr = "Hello World";
        System.out.println("indexOf(l)) : " + idxStr.indexOf("l")); // 2
        System.out.println("lastIndexOf(l)) : " + idxStr.lastIndexOf("l")); // 10
        System.out.println("indexOf(lo) : " + idxStr.indexOf("lo")); // 3
        System.out.println("indexOf(a) : " + idxStr.indexOf("a")); // -1

        // * substring : 문자열의 특정범위의 문자열을 반환 (원본 영향X)
        // > substring(int beginIndex) : 시작인덱스부터 문자열의 끝까지를 반환
        // > substring(int beginIndex, intendIndex) : 시작인덱스부터 끝인덱스 이전까지를 반환
        System.out.println("substring(6) : " + idxStr.substring(6)); // World
        System.out.println("substring(0, 4) : " + idxStr.substring(0, 4)); // Hell 4번인덱스는 포함 X 0<=  <4

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

        System.out.println("endsWith(.com) : " + email.endsWith(".com"));
        System.out.println("endsWith(.kr) : " + email.endsWith(".kr"));

        System.out.println("contains(@) : " + email.contains("@"));

        // * replace(CharSequence, CharSequence) : 첫번째 인자 문자열을 찾아 두번째 문자열로 변환시킨 새 문자열 반환
        String ip = "192.168.0.202";
        System.out.println("replace() : " + ip.replace(".", "_"));

        // * trim() : 문자열의 앞과 뒤의 공백을 제거한 새로운 문자열 반환
        String content = "\n 안녕하세요. 캥거루입니다. \n";
        System.out.println("trim() : #" + content.trim() + "#");

        // * isEmpty() : 문자열이 빈문자열("")일 경우 true 반환
        // * isBlank() : 문자열이 빈문자열("") 또는 공백문자열 ("  ")일 경우 true 반환 (자바 11 추가된 기능)
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());

        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        System.out.println("  ".isBlank());

        // * split(String) : 인자로 전달된 문자열을 기준으로 분리시켜 String[]에 담아 반환
        // * static join(CharSequence, CharSequence...)
        //      : 인자로 전달된 String[] 배열의 요소들을 특정 구분자와 함께 하나의 문자열로 연결시켜 반환

        String lectures = "Java,MySQL,MyBatis,Front,Spring";

        String[] lecArr = lectures.split(","); // {"Java", "MySQL", "MyBatis", "Front", "Spring"}
        System.out.println("분리된 문자열의 개수 : " + lecArr.length);
        for(String lec : lecArr){
            System.out.println(lec);
        }

        String newStr = String.join("-", lecArr); // Java-MySQL-MyBatis-Front-Spring
        System.out.println(newStr);

        // * toCharArray() : 문자열의 각 문자들을 char[]에 담아 반환
        char[] charArr = newStr.toCharArray();
        System.out.println("char[]의 길이 : " + charArr.length);
        System.out.println("1번 인덱스 : " + charArr[1]);


    }
}
