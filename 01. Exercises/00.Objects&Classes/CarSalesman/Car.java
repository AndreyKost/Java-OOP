package CarSalesman;

public class Car {
    private String model;
    private Engine engine;
    private int weight;
    private String color;

    public Car(String model,Engine engine){
        this.model=model;
        this.engine=engine;
        this.weight=0;
        this.color="n/a";
    }

    public void setWeight(int weight){
        this.weight=weight;
    }

    public void setColor(String color){
        this.color=color;
    }

    public int getWeight(){
        return weight;
    }

    public String getModel(){
        return model;
    }

    public Engine getEngine(){
        return engine;
    }

    public String getColor(){
        return color;
    }

}
