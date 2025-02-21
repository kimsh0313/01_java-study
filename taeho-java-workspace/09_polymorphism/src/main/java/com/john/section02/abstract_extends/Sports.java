package com.john.section02.abstract_extends;

/*  추상 클래스(abstract class)
    1. 형태를 갖추지 못한 클래스
    2. 일반 필드 + 일반 메서드 [+ 추상메서드] => 추상 메서드가 없어도 선언 가능
    3. 추상클래스로는 인스턴스 생성불가(레퍼런스 타입으로는 가능)
        => 추상클래스를 상속받는 하위클래스를 이용하여 인스턴스를 생성해야되고
        이때 추상클래스는 상위 타입 레퍼런스로 사용될 수 있음

    추상 메서드(abstract method)
    1. 형태를 갖추지 못한 메서드( {} X) => 본문이 필요없는 메서드
    2. 추상 메서드 선언지 해당 클래스도 추상 클래스로 정의해야함

*/
public abstract class Sports {
    private int people;

    public Sports() {
    }

    public Sports(int people) {
        this.people = people;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public abstract void rule();
}
