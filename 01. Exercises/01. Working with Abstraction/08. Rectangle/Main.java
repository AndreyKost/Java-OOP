package Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tokens[]=scanner.nextLine().split(" ");
        Point bottomeLeft=new Point(Integer.parseInt(tokens[0]),Integer.parseInt(tokens[1]));
        Point topRight=new Point(Integer.parseInt(tokens[2]),Integer.parseInt(tokens[3]));
        Rectangle rectangle=new Rectangle(bottomeLeft,topRight);
        int n=Integer.parseInt(scanner.nextLine());

        while (n-- >0){
            String[] line=scanner.nextLine().split(" ");
            Point myPoint=new Point(Integer.parseInt(line[0]),Integer.parseInt(line[1]));

            System.out.println(rectangle.contains(myPoint));

        }





    }
}
