package CarSalesman;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        ArrayList<Car> listOfCars=new ArrayList<>();
        ArrayList<Engine> listOfEngines=new ArrayList<>();

        while (n-- >0){
            String tokens[]=scanner.nextLine().split(" ");
            String model=tokens[0];
            int power=Integer.parseInt(tokens[1]);
            Engine engine=new Engine(model,power);
            if(tokens.length==3){
                if(Character.isDigit(tokens[2].charAt(0))){
                    engine.setDisplacement(Integer.parseInt(tokens[2]));
                } else {
                    engine.setEfficiency(tokens[2]);
                }
            } else if(tokens.length==4){
                engine.setDisplacement(Integer.parseInt(tokens[2]));
                engine.setEfficiency(tokens[3]);
            }

            listOfEngines.add(engine);

        }

        int m=Integer.parseInt(scanner.nextLine());
        while (m-- >0){
            String tokens[]=scanner.nextLine().split(" ");
            String model=tokens[0];
            String engine=tokens[1];
            for (Engine listOfEngine : listOfEngines) {
                if(listOfEngine.getModel().equals(engine)){
                    Car car=new Car(model,listOfEngine);
                    if(tokens.length==3){
                        if(Character.isDigit(tokens[2].charAt(0))){
                            car.setWeight(Integer.parseInt(tokens[2]));
                        } else {
                            car.setColor(tokens[2]);
                        }
                    } else if(tokens.length==4){
                        car.setWeight(Integer.parseInt(tokens[2]));
                        car.setColor(tokens[3]);
                    }
                    listOfCars.add(car);
                }
            }

        }


        for (int i = 0; i <listOfCars.size() ; i++) {
            System.out.printf("%s:%n",listOfCars.get(i).getModel());
            System.out.printf("%s:%n",listOfCars.get(i).getEngine().getModel());
            System.out.printf("Power: %d%n",listOfCars.get(i).getEngine().getPower());
            if(listOfCars.get(i).getEngine().getDisplacement()==0){
                System.out.println("Displacement: n/a");
            } else {
                System.out.printf("Displacement: %d%n",listOfCars.get(i).getEngine().getDisplacement());
            }
            System.out.printf("Efficiency: %s%n",listOfCars.get(i).getEngine().getEfficiency());
            if(listOfCars.get(i).getWeight()==0){
                System.out.println("Weight: n/a");
            } else {
                System.out.printf("Weight: %d%n",listOfCars.get(i).getWeight());
            }
            System.out.printf("Color: %s%n",listOfCars.get(i).getColor());
        }




    }
}
