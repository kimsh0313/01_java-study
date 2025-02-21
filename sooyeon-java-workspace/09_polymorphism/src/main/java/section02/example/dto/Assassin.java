package section02.example.dto;

public class Assassin extends Character {

    public Assassin() {
    }

    public Assassin(String name, int hp, int level, int experience) {
        super(name, hp, level, experience);
    }

    @Override
    public void attack() {
        System.out.println("맨손");
        updateExperience(5);
    }

    @Override
    public void defense() {
        System.out.println("피한다");
    }

    @Override
    public String toString() {
        return "Assassin{ +" +
                super.toString()
                + "}";
    }
}
