package section02.string;

public class Application {
    public static void main(String[] args) {
        String str1 = "Hello World";
        System.out.println("length() : " + str1.length());
        System.out.println("charAt(0) : " + str1.charAt(0));

        String str2 = "java";
        String str3 = "java";
        String str4 = "JAVA";
        String str5 = "oracle";
        String test1 = "!";
        String test2 = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";

        // compareTo(String):인자로 전달된 문자열과 사전순으로 비교 => 첫번째 문자 거리 만큼의 정수 반환
        System.out.println(str2.compareTo(str3));
        System.out.println(str2.compareTo(str4));
        System.out.println(str4.compareTo(str2));
        System.out.println(str2.compareTo(str5));
        System.out.println(str5.compareTo(str2));
        System.out.println(test1.compareTo(test2));
        
        // compareToIgnoreCase(String): 대소문자를 구분하지 않고 비교
        System.out.println(test2.compareToIgnoreCase(test1));
        System.out.println(str2.compareToIgnoreCase(str4));

        // equals(Obj): 기존 문자열과 인자로 전달된 문자열이 일치하는지 비교 후 반환
        // equalsIgnoreCase: equals와 동일하나 대소문자 구분X
        System.out.println(str2.equals(str4));
        System.out.println(str2.equalsIgnoreCase(str4));

        // comcat(String): 기존 문자열에 전달된 인자를 추가로 합친 새로운 문자열을 반환(원본 영향X)
        System.out.println("concat() : " + str1.concat(str2));
        System.out.println(str1);
        
        // indexOf(String) 인자로 전달된 문자열을 앞부터 탐색해서 처음으로 일치하는 인덱스 위치 반환(없으면 -1)
        // lastIndexOf(String) 인자로 전달된 문자열을 뒤부터 탐색해서 처음으로 일치하는 인덱스 위치 반환(없으면 -1)
        // 찾는 문자열의 길이가 복수인 경우 시작인덱스 값 반환
        System.out.println("indexOf() : " + str1.indexOf("o"));
        System.out.println("lastIndexOf() : " + str1.lastIndexOf("o"));
        System.out.println("lastIndexOf() : " + str1.lastIndexOf("ll"));

        // substring: 문자열의 특정범위의 문자열을 반환
        // substring(int beginIdx): beginIdx부터 문자열 끝까지 반환
        // substring(int beginIdx, int endIdx): beginIdx 부터 endIdx 이전 까지 반환
        System.out.println("substring() : " + str1.substring(1));
        System.out.println("substring() : " + str1.substring(3, 7));

        // toUpperCase(), toLowerCase(): 문자열을 대문자/소문자로 변경한 새로운 문자열 반환
        System.out.println("toUpperCase() : " + str1.toUpperCase());
        System.out.println("toLowerCase() : " + str1.toLowerCase());

        /*
            CharSequence: String 클래스가 구현하고 있는 부모 인터페이스
                - contains(CharSequence)    : 인자로 전달된 문자열이 포함되어 있는 경우 true
                - startsWith(String)        : 인자로 전달된 문자열로 시작하는 경우 true
                - endsWith(String)          : 인자로 전달된 문자열로 끝나는 경우 true
         */

        String email = "test01@gmail.com";

        System.out.println("startsWith() : " + email.startsWith("user"));
        System.out.println("startsWith() : " + email.startsWith("t"));
        System.out.println("endsWith() : " + email.endsWith("o"));
        System.out.println("endsWith() : " + email.endsWith("m"));
        System.out.println("endsWith() : " + email.endsWith("om"));
        System.out.println("contains() : " + email.contains("o"));

        //replace() : 첫번째 인자 문자열을 찾아 두번째 문자열로 변환시킨 후 새 문자열 반환
        String ip = "127.0.0.1";
        System.out.println("replace() : " + ip.replace(".", "-"));

        //trim() : 문자열의 앞뒤 공백 제거한 새로운 문자열 반환
        String content = "\n 안녕하세요. 캥거루입니다. \n";
        System.out.println("trim() : " + content.trim() + "#");

        //isEmpty(): 문자열이 빈 문자열 ("")인 경우 true
        //isBlank() : 문자열이 빈 문자열 또는 공백 문자열인 경우 true
        System.out.println("".isEmpty());
        System.out.println("".isBlank());
        System.out.println(" ".isEmpty());
        System.out.println(" ".isBlank());
        
        // split(String): 인자로 전달된 문자열을 기준으로 분리시켜 String[]에 담아서 반환
        String lectures = "jAVA-Python-Mysql-Backend-Spring";
        String newStr = String.join("-", lectures);
        System.out.println(newStr);

    }
}
