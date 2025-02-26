package practice2.dto;

public class GalaxyNote9 extends SmartPhone {

    public GalaxyNote9() {
    }

    @Override
    public void printMaker() {
        System.out.println("갤럭시 노트 9는 삼성에서 만들어 졌다.");
    }

    @Override
    public void charge() { //CellPhone
        System.out.println("고속 충전, 고속 무선 충전");
    }

    @Override
    public void picture() { //Camera
        System.out.println("1300만 듀얼카메라");
    }

    @Override
    public void makeaCall() { //Phone
        System.out.println("번호를 누르고 통화버튼을 누름");
    }

    @Override
    public void takeaCall() { //Phone
        System.out.println("전화받기 버튼을 누름");
    }

    @Override
    public void touch() { //TouchDisplay
        System.out.println("정전식, 와콤펜 지원");
    }

}
