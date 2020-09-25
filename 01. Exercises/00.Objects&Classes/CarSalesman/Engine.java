package CarSalesman;

public class Engine {
    private String model;
    private int power;
    private int displacement;
    private String efficiency;

    public Engine(String model,int power){
        this.model=model;
        this.power=power;
        this.displacement=0;
        this.efficiency="n/a";
    }

    public void setDisplacement(int displacement){
        this.displacement=displacement;
    }

    public void setEfficiency(String efficiency){
        this.efficiency=efficiency;
    }

    public String getModel(){
        return model;
    }

    public int getDisplacement(){
        return displacement;
    }

    public int getPower(){
        return power;
    }

    public String getEfficiency(){
        return efficiency;
    }

}
