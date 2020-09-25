package CatLady;

public class StreetExtraordinaire extends Cat{

    public StreetExtraordinaire(String name, double specialSkill) {
        super(name, specialSkill);
    }

    @Override
    public String toString() {
        return "StreetExtraordinaire " +super.toString();
    }
}
