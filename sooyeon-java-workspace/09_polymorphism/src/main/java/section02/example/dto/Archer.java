package section02.example.dto;

public class Archer extends Character {
    private int arrowAttackDistance;
    private int arrowCount;

    public Archer() {
    }


    public Archer(String name, int hp, int level, int experience, int distance, int arrowCount) {
        super(name, hp, level, experience);
        this.arrowAttackDistance = distance;
        this.arrowCount = arrowCount;
    }

    public int getArrowAttackDistance() {
        return arrowAttackDistance;
    }

    public void setArrowAttackDistance(int arrowAttackDistance) {
        this.arrowAttackDistance = arrowAttackDistance;
    }

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    @Override
    public void attack() {
        if (arrowCount > 0) {
            System.out.println(arrowAttackDistance + "m 거리까지 적을 화살로 쏴서 공격한다");
            System.out.println("잔여활수  "+ (--arrowCount));
            updateExperience(15);
        }else {
            System.out.println("잔여 활이 없어 공격 불가능");
        }
    }

    @Override
    public void defense() {
        System.out.println("못막음");
        updateHp(-20);
    }

    @Override
    public String toString() {
        return "Archer{" +
                super.toString() +
                "distance=" + arrowAttackDistance +
                ", arrowCount=" + arrowCount +
                '}';
    }
}
