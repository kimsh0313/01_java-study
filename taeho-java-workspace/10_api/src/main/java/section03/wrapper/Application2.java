package section03.wrapper;

public class Application2 {
    public static void main(String[] args) {
        byte b = Byte.parseByte("1");
        short s = Short.parseShort("2");
        int i = Integer.parseInt("3");
        long l = Long.parseLong("4");
        float f = Float.parseFloat("5.0f");
        double d = Double.parseDouble("6.0");
        boolean bool = Boolean.parseBoolean("true");
        char c = "test".charAt(0);

        System.out.println("===================");
        String str = "10";
        String str2 = "22.22";
        System.out.println(str + str2);
        int strNum = Integer.parseInt("10");
        double strNum2 = Double.parseDouble("22.22");
        System.out.println(strNum + strNum2);



    }
}
