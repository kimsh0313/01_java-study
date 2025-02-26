package practice3.mvc.run;

import practice3.mvc.controller.LibraryManager;
import practice3.mvc.view.LibraryMenu;

public class Application {
    /**
     * 1. 회원 정보를 입력받는다.
     * 2. 회원정보출력, 조회,검색, 대여 서비스 중 하나를 실행한다.
     * <p>
     * 대여시.
     * 만화책 : 회원의 나이 확인
     * 요리책 : 요리책에 쿠폰이 있으면 사용자에게 전해진다.
     * <p>
     * -> 대여시 validation, promotion 존재 -> 인터페이스로 해도 ㄱㅊ을듯
     * 커멘트패턴으로
     * 일단 도서 정보를 매니저 클래스에 저장하고, 그 클래스 메인 메서드로
     * 사용자 객체, 입력 도서를 제공받으면
     * manager에서 우선 validate실행 후 만약 promotion이 있으면 적용
     * <p>
     * <p>
     * <p>
     * --------
     * mvc 패키지 하위에 있는 패키지들
     * 1. controller
     * 2. dto : 객체 엔티티
     * 3. run : Application
     * 4. view
     */
    public static void main(String[] args) {
        LibraryMenu menu = new LibraryMenu();
        menu.mainMenu();
    }

}
