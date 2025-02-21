package section02.abstract_extends;

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
    /**
     * ##추상메서드
     * 1. 형태를 완전리 갖추기 못한 메서드 - 본문 없음
     */
}
