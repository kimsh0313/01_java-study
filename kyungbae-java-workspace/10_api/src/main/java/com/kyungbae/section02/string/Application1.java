package com.kyungbae.section02.string;

public class Application1 {
    public static void main(String[] args) {

        // length() : 문자열의 길이(글지수) 반환
        String str1 = "hello";
        System.out.println("length() : " + str1.length()); // 5

        // charAt(int) : 문자열로부터 인자로 전달된 인덱스 자리의 문자 반환
        System.out.println("charAt(2) : " + str1.charAt(2)); // l


        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";
        /*
        compareTo(String) : 인자로 전달된 문자열과 사전순으로 비교(대소문자 구분)하여 정수로 반환
        기준이되는문자열 - 인자로전달되는문자열
        => 두 문자열이 같을 경우 0 반환
        => 인자 문자열이 더 클 경우 음수 반환
        => 인자 문자열이 더 작을 경우 양수 반환
        */
        System.out.println("compareTo() : " + str2.compareTo(str3)); // 0
        System.out.println("compareTo() : " + str2.compareTo(str4)); // 32 (인자로 전달된 문자열이 더 작다)
        System.out.println("compareTo() : " + str4.compareTo(str2)); // -32 (위의 반대)
        System.out.println("compareTo() : " + str2.compareTo(str5)); // -5

        // compareToIgnoreCase() : compareTo와 동일하나 대소문자를 구분하지 않고 비교하여 변환
        System.out.println("compareToIgnoreCase() : " + str2.compareToIgnoreCase(str4)); // 0

        // equals(Object) : 기존 문자열과 인자로 전달된 문자열이 일치하는지 비교 후 반환 (대소문자 구분)
        // equalsIgnoreCase(String) : equals와 동일하나 대소문자를 구분하지 않고 비교 후 반환
        System.out.println("equals() : " + str2.equals(str4)); // false
        System.out.println("equalsIgnoreCase() : " + str2.equalsIgnoreCase(str4)); // true

        //concat(String) : 기준이되는 문자열에 인자로 전달된 문자열을 합친 새로운 문자영을 반환 (원본 문자열에 영향X)
        System.out.println("concat() : " + str2.concat(str5)); // javaoracle
        System.out.println("str2 : " + str2);

        // indexOf(String) : 인자로 전달된 문자열을 '앞'에서부터 탐색해서 처음 일치하는 인덱스 위치 반환 (없으면 -1 반환)
        // lastIndexOf(String) : '뒤'에서부터 탐색 (없으면 -1 반환)
        String idxStr = "Hello world";
        System.out.println("indexOf(l) : " + idxStr.indexOf('l')); // 1
        System.out.println("lastIndexOf(l) : " + idxStr.lastIndexOf('l')); // 9
        System.out.println("indexOf(lo) : " + idxStr.indexOf("lo")); // 3
        System.out.println("indexOf(a) : " + idxStr.indexOf('a')); // -1

        // substring : 문자열의 특정범위의 문자열을 반환 (원본 영향 x)
        // > substring(int beginIndex) : 시작 index 에서부터 문자열의 끝까지를 반환
        // > substring(int beginIndex, int endIndex) : 시작 index 에서부터 끝 index 까지 반환
        System.out.println("substring(6) : " + idxStr.substring(6)); // world
        System.out.println("substring(0, 5) : " + idxStr.substring(0, 5)); // 0 <=  < 4 Hello

        // toUpperCase() : 문자열을 대문자로 변경한 새로운 문자열 반환 (원본 영향 X)
        // toLowerCase() : 문자열을 소문자로 변경한 새로운 문자열 반환 (원본 영향 X)
        System.out.println("toUpperCase() : " + idxStr.toUpperCase());
        System.out.println("toLowerCase() : " + idxStr.toLowerCase());

        // > CharSequence : String 클래스가 구현하고 있는 부모 인터페이스
        // contains(CharSequence) : 인자로 전달된 문자열이 포함되어 있을 경우 true 반환
        // startsWith(String) : 인자로 전달된 문자열로 시작할 경우 true 반환
        // endsWith(String) : 인자로 전달된 문자열로 끝날 경우 true 반환
        String email = "user01@naver.com";

        System.out.println("startWith(user) : " + email.startsWith("user")); // true
        System.out.println("startWith(admin) : " + email.startsWith("admin")); // false

        System.out.println("endsWith(.com) : " + email.endsWith(".com")); // true
        System.out.println("endsWith(.kr) : " + email.endsWith(".kr")); // false

        System.out.println("contains(@) : " + email.contains("@")); // true

        // replace(CharSequence, CharSequence) : 첫번째 인자 문자열을 찾아 두번째 문자열로 변환시킨 새 문자열 반환
        String ip = "192.168.0.202";
        System.out.println("replace(.,_)" + ip.replace(".","_"));

        // trim() : 문자열의 앞과 뒤의 공백을 제거한 새로운 문자열 반환
        String content = "\n  안녕하세요.  \n";
        System.out.println("#" + content + "#");
        System.out.println("trim() : #" + content.trim() + "#");

        // isEmpty() : 문자열이 빈문자열("")일 경우 true 반환
        // isBlank() : 문자열이 빈문자열("") 또는 공백문자열(" ")일 경우 true 반환 (자바 11 이상)
        System.out.println("".isEmpty()); // true
        System.out.println(" ".isEmpty()); // false

        System.out.println("".isBlank()); // true
        System.out.println(" ".isBlank()); // true
        System.out.println("  ".isBlank()); // true

        // split(String) : 인자로 전달된 문자열을 기준으로 분리시켜 String[]에 담아 반환
        // static join(CharSequence, CharSequence...)
        //      : 인자로 전달된 String[] 배열의 요소들을 특정 구분자와 함꼐 하나의 문자열로 연결시켜 반환
        String lectures = "java,MySQL,MyBatis,Fornt,Spring";
        String[] lecArr = lectures.split(",");
        for (String arr : lecArr) {
            System.out.print(arr + " ");
        }

        String joinlec = String.join("-", lecArr); // java-MySQL-MyBatis-Fornt-Spring
        System.out.println("\n" + joinlec);

        // toCharArray() : 문자열의 각 문자들을 char[]에 담아 반환
        char[] charArr = joinlec.toCharArray();
        System.out.println("char[] 길이: " + charArr.length);
        System.out.println("1번 인덱스: " + charArr[1]);
        for(char arr : charArr){
            System.out.print("'" + arr + "' ");
        }
    }
}
