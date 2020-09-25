package car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String make;
    private String model;
    private int horsePower;
    private List<String> parts;

    /*public Car(){
        this.make="Ford";
    }*/

    public Car(String make, String model, int horsePower){
        this.make=make;
        this.model=model;
        this.horsePower=horsePower;
        //this.parts=new ArrayList<>();
    }

    public Car(String make){
        this.make=make;
        this.model="unknown";
        this.horsePower=-1;
    }


    public String getMake(){
        return this.make;
    }
    public void setMake(String make){
        this.make=make;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model=model;
    }
    public int getHorsePower(){
        return this.horsePower;
    }
    public void setHorsePower(int horsePower){
        this.horsePower=horsePower;
    }

    public void getInfo(String make, String model, int horsePower){
        System.out.println(String.format("The car is: %s %s - %d HP.",this.getMake(),this.getModel(),this.getHorsePower()));

    }

    public void increaseHP(int value){
        this.horsePower+=value;
    }



}
