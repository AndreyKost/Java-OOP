package farm.animals;

import farm.foods.Food;

public abstract class Mammal extends Animal {
    private String livingRegion;

    protected Mammal(String name, String type, double weight, String livingRegion) {
        super(name, type, weight);
        this.livingRegion = livingRegion;
    }

    @Override
    public void eat(Food food) {
        boolean foodIsMeat = food.getClass().getSimpleName().endsWith("Meat");

        //taka vzemame koi klas vika metoda toest koe jivotno vika metoda im u znaem class i imeto
        //String animal=this.getClass().getSimpleName();

        if(foodIsMeat && !(this instanceof Felime)){
            String message=(this.getType()+"s are not eating that type of food!").replace("Mouses","Mice");

            throw new IllegalArgumentException(message);
        } else if(!foodIsMeat && this.getType().equals("Tiger")) {
            throw new IllegalArgumentException("Tigers are not eating that type of food!");
        }
        super.eat(food);
    }

    @Override
    public String toString(){
        return String.format("%s[%s, 167.7, Asia, 0]"
        ,this.getType())
                ,t
    }

}
