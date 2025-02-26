package section03.interface_implements;

public class Application {
    public static void main(String[] args) {
        /**
         * 추상, 인터페이스는 인스턴스, 객체로는 생성이 불가하다.
         * 단. 레퍼런스, 즉 타입으로는 선언이 가능하다.
         */


        Behavior[] behavior = new Behavior[2];
        //*인터페이스로 들어가기 때문에 인터페이스에 정의한 메서드만 호출할 수 있음
        behavior[0] = new Student("홍길동",15,"ssg",2);
        behavior[1] = new Worker("김말순",35,"ssgi&c","차장");

        for(Behavior b : behavior){
            System.out.println(b);
            b.eat();
            b.work();
            b.die();
        }

        //인터페이스에 정의되지 않은 메서드를 사용하고 싶으면 형변환을 해줘야함.
        Student student = (Student) behavior[0];
        System.out.println(student.getName());

        /**
         * 클래스에서 클래스를 상속받을 떄
         * - 단일상속 가능
         * - extends
         * - 화살표 실선
         *
         * 클래스에서 인터페이스를 구현impl할때
         * - 다중상속 가능
         * - implements
         * - 점선
         *
         * 인터페이스에서 인터페이스를 상속받을 때
         * - 다중상속 가능
         * - extends + implements
         */

        /**
         * 강제성
         * 1. 일반
         * 2. 추상
         * 3. 인터페이스
         */


    }
}
