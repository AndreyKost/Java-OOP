package CatLady;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String data=scanner.nextLine();
        HashMap<String, Cat> cats=new HashMap<>();


        while (!data.equals("End")){
            String tokens[]=data.split(" ");
            String breed=tokens[0];
            String name=tokens[1];
            double specialData=Double.parseDouble(tokens[2]);

            Cat cat=null;

            switch (breed){
                case "Siamese":
                    cat=new Siamese(name,specialData);
                    break;
                case "Cymric":
                    cat=new Cymric(name,specialData);
                    break;
                case "StreetExtraordinaire":
                    cat=new StreetExtraordinaire(name,specialData);
                    break;
            }
            cats.putIfAbsent(name, cat);

            data=scanner.nextLine();
        }

        String catName=scanner.nextLine();

        Cat cat=cats.get(catName);
        System.out.println(cat.toString());


    }
}
