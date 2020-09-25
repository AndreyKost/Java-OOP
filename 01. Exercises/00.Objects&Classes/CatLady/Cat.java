package CatLady;

public class Cat {
    private String name;
    private double specialSkill;

    public Cat(String name, double specialSkill){
        this.name=name;
        this.specialSkill=specialSkill;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f",this.name,this.specialSkill);
    }
}
