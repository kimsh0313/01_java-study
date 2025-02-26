package section03.wrapper;

public class Application2 {
    public static void main(String[] args) {
        /**
         * 문자열 -> 기본자료형
         */

        byte b = Byte.parseByte("1");
        short s = Short.parseShort("1");
        int i = Integer.parseInt("1");
        long l = Long.parseLong("1");
        float f = Float.parseFloat("1");
        double d = Double.parseDouble("1");
        Boolean bool = Boolean.parseBoolean("true");
        char c = "Awegf".charAt(0);
    }
}
