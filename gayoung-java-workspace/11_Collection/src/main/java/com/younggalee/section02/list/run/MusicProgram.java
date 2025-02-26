package com.younggalee.section02.list.run;

import com.younggalee.section02.list.view.MusicView;

public class MusicProgram {

    /*
        ## MVC 패턴 ##
        각 클래스마다 역할(데이터 담당M, 화면 담당v, 요청처리 담당)을 부여해서 작업
        유지보수시 용이

        > M(model) : 데이터를 담당하는 역할의 클래스
                     ㄴ 데이터들ㄹ을 담기위한 클래스 (dto)  - getter/setter
                     ㄴ 비즈니스 로직 처리하기 위한 클래스 (service)
                     ㄴ 데이터가 보관되어있는 보관함과 연결해서 입출력하는 클래스 (dao)

        > V(view) : 화면을 담당하는 역할의 클래스
                    즉, 사용자에게 보여지는 시각적인 요소
                    출력문(print), 입력문(Scanner)

        > C(controller) : 사용자가 요청한 내용을 처리한 후, 그 결과를 돌려주는 역할의 클래스

     */
    public static void main(String[] args) {
        new MusicView().mainMenu();  //// 사용자가 보게 되는 메인 페이지에서 시작
    }

}
