package com.ino.section02.string;

public class Application1 {
    public static void main(String[] args) {
        String str1 = "hi";
        System.out.println("length : " + str1);

        System.out.println("charat : " + str1.charAt(0));

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        // compareTo(String) 인자 전다 ㄹ문자열과 사전순으로 비교(대소문자 구분) 하여 정수 반환
        // 기준 문자열 - 인자 전달 문자열
        // 같은 경우 0, 인자 문자열이 더 큰 경우 음수, 인자 문자열이 더 작은 경우 양수
        System.out.println(str2.compareTo(str3));
        System.out.println(str2.compareTo(str4));
        // 동일하나 대소문자 구분x 비교반환
        System.out.println("compareToIgnoreCase() : " + str2.compareToIgnoreCase(str4));
        // equals : 기존 문자열과 인자로 전달된 문자열이 일치하는지 비교 후 반환
        System.out.println("equals : " + str2.equals(str4));
        // equalsIgnoreCase : 대소문자 구분x, bool 리턴
        System.out.println("equalsIgnoreCase : " + str2.equalsIgnoreCase(str4));

        //concat : str1 + str2 -> str3
        System.out.println("concat : " + str1.concat(str2));

        // indexOf : str1.(str2) -> return first match index ( if not return -1 )
        // lastIndexOf " ->  search from last , return first mathc index ( if not match, return -1 )
        String idxStr = "Hello World";
        System.out.println("indexOf : " + idxStr.indexOf("l"));
        System.out.println("lastIndexOf : " + idxStr.lastIndexOf("l"));

        // substring : 문자열 특정 범위 문자열 반환
        System.out.println("substring : " + idxStr.substring(2, 7));

        System.out.println("toUpperCase : " + idxStr.toUpperCase());
        System.out.println("toLowerCase : " + idxStr.toLowerCase());

        // contains(CharSequence) String의 부모 인터페이스
        System.out.println("contains : " + idxStr.contains("Hello"));

        // startsWith 인자 전달 문자열로 시작시 true 반환
        System.out.println("startsWith : " + idxStr.startsWith("Hello"));

        // endsWith 인자 전달 문자열로 끝날시 true 반환
        System.out.println("endsWith : " + idxStr.endsWith("World"));

        //replace (CharSequence,CharSequence)
        System.out.println("replace : " + idxStr.replace("Hello" , "Merong"));

        String trimStr = " asdsad    ";
        //trim
        System.out.println("trim : " + "$" +  trimStr.trim() + "$");

        //isEmpty()
        System.out.println("isEmpty : " + "".isEmpty());
        //isBlank() "" or "    " -> true over than Java11
        System.out.println("isBlank : " + " ".isBlank() );

        // split(String) -> String[]
        System.out.println("split :" + idxStr.split(" ")[0].toString());

        // join(separate CharSequence, CharSequence...) - Static method, 가변인자 매개변수
        System.out.println(String.join(",", "Hello", "my", "name" , "is " ,"ino"));
        // toCharArray() : 문자열의 각 문자를 char[]에 담아 반환
        char[] cArr = idxStr.toCharArray();
        System.out.println("char[] length: " + cArr.length);
        System.out.println("1st idx : " + cArr[1]);
    }
}
