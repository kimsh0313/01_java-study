package com.minkook.section01.math;

public class Application1 {
    public static void main(String [] args){
        String str2 = "JAVA";
        String str3 = "JAVA";
        String str4 = "java";
        String str5 = "oracle";
        
        /*
            compare(String) : 인자로 전달된 문자얄과 사전순으로 비교(대소문자 구분)하여 정수반환
            기준이 되는 문자열 - 인자로 전달되는 문자열
            => 두 문자열이 같을 경우 0반환
            => 인자 문자열이 더 클경우 음수 반환
            => 인자 문자열이 더 작을경우 양수반환
         */
        System.out.println("compareTo(): " + str5.compareTo(str4));
        System.out.println("compareTo(): " + str4.compareTo(str5));
        
        // * comparteToIgnoreCase(String) : compareTo와 동일하나 대소문자를 구분하지 않고 비교하여 반환
        System.out.println("comparteToIgnoreCase: " + str2.compareToIgnoreCase(str4));

        // * equals(Object) : 기존 문자열과 인자로 전달된 문자열이 일치하는지 비교후 반환(대소문자 구분)
        // * equalsIgnoreCase(String): equals와 동일하나 대소문자를 구분하지 않고 비교 후 반환
        System.out.println("equals(): " + str2.equals(str4));

        // * concat(String) : 기준 문자열에 인자로 전달된 문자열을 합친 새로운 문자열을 반환(원본 문자열에 영향x)
        System.out.println("concat(): " + str2.concat(str5));

        // * indexOf(String) : 인자로 전달된 문자열을 앞에서부터 탐색해서 처음 일치하는 인덱스 위치 반환(-1)
        // * lastIndexOf(String) : 인자로 전달된 문자열을 뒤에서부터 탐색해서 처음 일치하는 인덱스 위치 반환(-1)

        String idxStr = "Hello World";
        System.out.println(idxStr.indexOf("l"));
        System.out.println(idxStr.lastIndexOf("l"));
        
        // * substring : 문자열의 특정범위의 문자열을 반환
        // > substring(int beginIndex)
        // > substring(int,int  beginIndex,endIndex)

        System.out.println("substring(6): " + idxStr.substring(6));
        System.out.println("substring(6): " + idxStr.substring(0,6));
        System.out.println("substring(6): " + idxStr.replace(" ",""));
        
        // > CharSequenece: String 클래스가 구현하고 있는 부모 인터페이스
        // * contains(CharSequenece) : 인자로 전달된 문자열이 포함되어 있을 경우  true반환
        // * startWith(String) : 인자로 전달된 문자열로 시작할 경우 true 반환
        // * endWith(String) : 인자로 전달된 문자열로 끝날경우 true반환
        String email = "user01@naver.com";
        System.out.println("startsWith(user): " + email.startsWith("user"));
        System.out.println("startsWith(user): " + email.startsWith("admin"));
        System.out.println("startsWith(user): " + email.endsWith(".com"));
        
        // * replace(CharSequenece,CharSequenece) : 첫번째 인자 문자열을 찾아 두번째 문자열로 변환시킨 새 문자열 반환
        String ip = "192.168.0.202";
        System.out.println("replace(): " + ip.replace(".","-"));



        // * trim() : 문자열의 앞과 뒤의 공백을 제거한 새로운 문자열 반환
        String content = "\n 안녕하세요. 캥거루입니다. \n";
        System.out.println(content);
        System.out.println(content.trim());

        // * isEmpty() : 문자열이 빈문자열("")일 경우 true 반환
        // * isBlank() : 문자열이 빈문자열("") 또는 공백문자열(" " )일 경우 true 반환(자바 11 추가된 기능)\
        System.out.println("".isEmpty());
        System.out.println(" ".isEmpty());
        System.out.println("".isBlank());
        System.out.println(" ".isBlank());
        
        // * split(String) : 인자로 전달된 문자열을 기준으로 분리시켜 String[]에 담아 반환
        // * static join(CharSequenece,CharSequenece...)
            // 인자로 전달된 String[] 배열의 요소들을 특정 구분자와 함께 하나의 문자열로 연결시켜 반환
        String lectures = "Java,MySQL,MyBatis,Front,Spring";
        String [] arr = lectures.split(",");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        String newArr = String.join("-",arr);
        System.out.println(newArr);

        // * toCharArray() : 문자열의 각 문자들을 char[]에 담아 반환
        char [] charArr = newArr.toCharArray();
        System.out.println(charArr.length);
        System.out.println(charArr[1]);

    }
}
