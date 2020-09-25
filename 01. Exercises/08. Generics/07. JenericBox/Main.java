package JenericBox;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        while (n-- >0){
            String line=scanner.nextLine();

            Box<Integer> box=new Box(Integer.parseInt(line));
            System.out.println(box.toString());

        }


    }
}
