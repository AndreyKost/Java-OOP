package SpeedRacing;

public class Car {

    private String model;
    private double fuelAmount;
    private double fuelCost;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCost){
        this.model=model;
        this.fuelAmount=fuelAmount;
        this.fuelCost=fuelCost;
        distanceTraveled=0;
    }

    public boolean calcAmt(int distance){
        double possibleKm=(distance*1.0)*fuelCost;
        if(fuelAmount>=possibleKm){
            increaseDistanceTraveled(distance);
            decreaseFuelAmount(possibleKm);
            return true;
        }
        return false;
    }

    public int increaseDistanceTraveled(int distance){
        return this.distanceTraveled+=distance;
    }

    public double decreaseFuelAmount(double amount){
        return this.fuelAmount-=amount;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public String getModel() {
        return model;
    }



}
