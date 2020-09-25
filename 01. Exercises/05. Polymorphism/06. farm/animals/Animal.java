package farm.animals;

import farm.foods.Food;

public abstract class Animal {
    private String name;

    protected String getType() {
        return this.type;
    }

    private String type;
    private double weight;
    private int foodEaten;

    protected Animal(String name, String type, double weight) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.foodEaten=0;
    }

    public abstract void makeSound();

    public void eat(Food food){
        this.foodEaten+=food.getQuantity();
    }

    @Override
    public String toString(){
        return String.format("%s[Jaguar, 500, Africa, 150]"
                ,this.getType())
                ,t
    }

}
