package SpeedRacing;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Car> listOfCars=new ArrayList<>();

        int n=Integer.parseInt(scanner.nextLine());
        while (n-- >0){
            String tokens[]=scanner.nextLine().split(" ");
            String model=tokens[0];
            double fuelAmount=Double.parseDouble(tokens[1]);
            double fuelCost=Double.parseDouble(tokens[2]);
            Car car=new Car(model,fuelAmount,fuelCost);
            listOfCars.add(car);
        }

        String line=scanner.nextLine();
        while (!line.equals("End")){
            String tokens[]=line.split(" ");
            String carModel=tokens[1];
            int amountOfKm=Integer.parseInt(tokens[2]);
            for (int i = 0; i <listOfCars.size() ; i++) {
                if(listOfCars.get(i).getModel().equals(carModel)){
                    if(listOfCars.get(i).calcAmt(amountOfKm)){
                        /*listOfCars.get(i).decreaseFuelAmount(amountOfKm);
                        listOfCars.get(i).increaseDistanceTraveled(amountOfKm);*/
                    } else {
                        System.out.println("Insufficient fuel for the drive");
                    }
                }
            }

            line=scanner.nextLine();
        }

        for (int i = 0; i <listOfCars.size() ; i++) {
            System.out.printf("%s %.2f %d%n",listOfCars.get(i).getModel(),listOfCars.get(i).getFuelAmount(),listOfCars.get(i).getDistanceTraveled());
        }

    }
}
