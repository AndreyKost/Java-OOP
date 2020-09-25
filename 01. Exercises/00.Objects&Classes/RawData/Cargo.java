package RawData;

import java.util.ArrayList;
import java.util.List;

public class Cargo {
    int cargoWeight;
    String cargoType;

    public Cargo(int cargoWeight, String cargoType){
        this.cargoWeight=cargoWeight;
        this.cargoType=cargoType;
    }

    public String getCargoType() {
        return this.cargoType;
    }
}
