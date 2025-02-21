package section02.example.dto;

public class Wizard extends Character {
    private int magicForce;

    public Wizard() {
    }

    public Wizard(String name, int hp, int level, int experience, int magicForce) {
        super(name, hp, level, experience);
        this.magicForce = magicForce;
    }

    public int getMagicForce() {
        return magicForce;
    }

    public void setMagicForce(int magicForce) { //전체적인 마력을 업데이트하는 메서드, 유효검증을 attack이 아니라 이곳에 배치하는게 맞음 - 마력이 0이하일때 초기화되는거는 공격과 상관 없음
        this.magicForce = magicForce;
        if (magicForce < 0) {
            System.out.println("마력 소진, 방어시 충전");
            magicForce = 0;
        }
    }

    @Override
    public void attack() {
        System.out.println("마법");
        updateExperience(10);
        setMagicForce(getExperience() -10);
    }

    @Override
    public void defense() {
        updateHp(-5);
        magicForce += 5;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                super.toString() +
                "magicForce=" + magicForce +
                '}';
    }
}
