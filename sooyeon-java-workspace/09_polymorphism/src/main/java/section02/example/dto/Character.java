package section02.example.dto;

public abstract class Character {
    private String name;
    private int hp;
    private int level;
    private int experience;

    public Character() {
    }

    public Character(String name, int hp, int level, int experience) {
        this.name = name;
        this.hp = hp;
        this.level = level;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void checkLevelUp() {
        if(experience >= 100){
            level++;
            experience -= 100;
        }
    }

    public void checkLevelDown() {
        if(hp <= 0) {
            level--;
            hp = 100;
            System.out.println("체력 모두 소모되어 레벨이 감소됨. 체력 다시 100");
        }
    }

    public void updateExperience(int newExperience) {
        experience += newExperience;
        checkLevelUp();
    }

    public void updateHp(int newHp) {
        hp += newHp;
        checkLevelDown();
    }

    public abstract void attack();

    public abstract void defense();

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", level=" + level +
                ", experience=" + experience +
                '}';
    }
}
