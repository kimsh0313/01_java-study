package section02.example.dto;

import java.util.Arrays;

public class Warrior extends Character {
    private String weapon;
    private String[] items;

    public Warrior() {
    }


    public Warrior(String name, int hp, int level, int experience, String weapon, String[] items) {
        super(name, hp, level, experience);
        this.weapon = weapon;
        this.items = items;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String[] getItems() {
        return items;
    }

    public void setItems(String[] items) {
        this.items = items;
    }

    @Override
    public void attack() {
        System.out.println(weapon + "휘두름");
        updateExperience(10);
        // setExperience(getExperience() + 10); getter+setter 로 구현
    }

    @Override
    public void defense() {
        System.out.println("방패");
        updateHp(-2);
//        setHp(getHp() - 2);
    }

    @Override
    public String toString() {
        return "Warrior{" +
                super.toString() +
                "weapon='" + weapon + '\'' +
                ", items=" + Arrays.toString(items) +
                '}';
    }

}
