package section02.string;

import java.util.StringTokenizer;

public class Application2 {
    public static void main(String[] args) {
        String str = "java,MySQL,MyBatis,Front,Spring";

        String[] strToken = str.split(",");

//        for (int i = 0; i < strToken.length; i++) {
//            System.out.println(i + " " + strToken[i]);
//        }


        /**
         *StringTokenizer는  split보다 더 빠르지만 일회성임.
         * 한번 사용하면 다시 사용 못함 - 그냥 입력값 parser할때
         */
        StringTokenizer st = new StringTokenizer(str, ",");
        st.nextToken().trim();
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }


    }
}
