package section02.string;

public class Application1 {
    public static void main(String[] args) {
//        String str = "abcde";
//
//        System.out.println(str.length());
//        System.out.println(str.charAt(0));
//        System.out.println(str.toUpperCase());
//        System.out.println(str.toUpperCase().toLowerCase());
//
//        /**
//         * compareTo
//         * 비교 문자가 같을 경우 = 0
//         * 클경우 = -
//         * 작을경우 = +
//         */
//
//        System.out.println(str.compareTo("abcde"));
//        System.out.println(str.compareToIgnoreCase("ABCDE"));
//
//        System.out.println("abcde".equals(str));
//        System.out.println("AbCdE".equalsIgnoreCase(str));
//
//
//        System.out.println("wef".concat(str));
//
//        System.out.println(str.indexOf("abc"));
//        System.out.println(str.lastIndexOf("e"));
//
//        System.out.println(str.substring(2));
//        System.out.println(str.substring(2,4));
//
//        String email = "abc@gmail.com";
//        System.out.println(email.startsWith("user"));
//        System.out.println(email.endsWith("@gmail.com") || email.contains("@naver.com"));
//
//        String newEmail = email.replace("@", "     ");
//        System.out.println(newEmail);
//
//        String blankWord = "                         ewfawef                                        ";
//        System.out.println(blankWord.trim());

        System.out.println("               ".isEmpty()); //false
        System.out.println("                ".isBlank()); //true

        System.out.println("".isBlank()); //t
        System.out.println("".isEmpty()); //t

        String workd = "1,2,3,4,5";
        String[] token = workd.split(",");

        for(String num :token) {
            System.out.println(num);
        }

        System.out.println(String.join("~~~~~", token));
    }

}
