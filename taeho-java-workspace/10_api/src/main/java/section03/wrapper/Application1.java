package section03.wrapper;

/*
    Wrapper
    1. 기본자료형을 인스턴스화 시킬 수 있는 클래스
    2. 기본자료형을 인스턴스화하는 경우
        2.1. 기본자료형 데이터를 가지고 메서드를 호출해야할 때
        2.2. 특정 메서드의 매개변수로 기본자료형이 아닌 객체 타입만이 요구될 때
        2.3. 다형성을 적용시키고 싶을때
    3. 종류
        Wrapper       기본
        Boolean   <->  boolean
        Byte      <->  byte
        Short     <->  short
        Integer   <->  int
        Long      <->  long
        Float     <->  float
        Double    <->  double
        Character <->  char

    - Boxing: 기본 자료형 => Wrapper 클래스자료형변환 (인스턴스화)
    - UnBoxing: Wrapper => 기본 자료형
*/
public class Application1 {
    public static void main(String[] args) {
        // Boxing
        int intVal = 20;
        int intVal2 = 30;

        Integer boxingVal = new Integer(intVal);
        Integer boxingVal2 = Integer.valueOf(intVal2);
        Integer boxingVal3 = intVal2;

        System.out.println(boxingVal);
        System.out.println(boxingVal2);
        System.out.println(boxingVal3);

        System.out.println(boxingVal.equals(boxingVal2));
        System.out.println((boxingVal.compareTo(boxingVal2)));
        
        int unBoxingVal = boxingVal.intValue();
        int unBoxingVal2 = boxingVal2.intValue();
        int unBoxingVal3 = boxingVal3;
        System.out.println(unBoxingVal);
        System.out.println(unBoxingVal2);
        System.out.println(unBoxingVal == boxingVal);
    }
}
