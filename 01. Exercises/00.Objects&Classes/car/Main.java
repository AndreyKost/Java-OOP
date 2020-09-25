package car;

import car.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= Integer.parseInt(scanner.nextLine());

        while (n>0){
            String tokens[]=scanner.nextLine().split(" ");
            if (tokens.length>1){
                Car car=new Car(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
                car.getInfo(car.getMake(),car.getModel(),car.getHorsePower());
            } else {
                Car car=new Car(tokens[0]);
                car.getInfo(car.getMake(),car.getModel(),car.getHorsePower());
            }




            n--;
        }




    }
}
