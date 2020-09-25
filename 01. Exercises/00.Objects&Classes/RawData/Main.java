package RawData;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<Car> listOfCars = new ArrayList<>();


        while (n-- > 0) {
            String tokens[] = scanner.nextLine().split(" ");
            String model = tokens[0];
            int speed = Integer.parseInt(tokens[1]);
            int power = Integer.parseInt(tokens[2]);
            int weight = Integer.parseInt(tokens[3]);
            String type = tokens[4];
            ArrayList<Tire> tireList = new ArrayList<>();
            for (int i = 5; i < 12; i += 2) {
                int idx = i + 1;
                Tire tire = new Tire(Double.parseDouble(tokens[i]), Integer.parseInt(tokens[idx]));
                tireList.add(tire);
            }

            Engine engine = new Engine(speed, power);
            Cargo cargo = new Cargo(weight, type);

            Car car = new Car(model, engine, cargo, tireList);
            listOfCars.add(car);

        }

        String type=scanner.nextLine();

        System.out.println();
        if(type.equals("fragile")){
            ArrayList<String> model=new ArrayList<>();


            for (int i = 0; i <listOfCars.size() ; i++) {
                if(listOfCars.get(i).getCargo().getCargoType().equals("fragile")){
                    if(listOfCars.get(i).getTires().get(i).getTirePressure()<1){
                        model.add(listOfCars.get(i).getModel());
                    }
                }
            }
            model.forEach(e -> System.out.println(e));
        } else {
            ArrayList<String> model=new ArrayList<>();
            for (int i = 0; i <listOfCars.size() ; i++) {
                if(listOfCars.get(i).getCargo().getCargoType().equals("flamable")){
                    if(listOfCars.get(i).getEngine().getEnginePower()>250){
                        model.add(listOfCars.get(i).getModel());
                    }
                }
            }
            model.forEach(e -> System.out.println(e));
        }




    }


}
