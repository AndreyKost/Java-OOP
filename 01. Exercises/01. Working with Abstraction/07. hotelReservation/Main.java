package hotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(" ");

        double price=Double.parseDouble(tokens[0]);
        int days=Integer.parseInt(tokens[1]);
        Season season=Season.valueOf(tokens[2].toUpperCase());
        Discount discount=Discount.valueOf(tokens[3].toUpperCase());

        Reservation reservation=new Reservation(price,days,season,discount);
        PriceCalculator priceCalculator=new PriceCalculator();
        System.out.printf("%.2f",priceCalculator.calculate(reservation));




    }
}
