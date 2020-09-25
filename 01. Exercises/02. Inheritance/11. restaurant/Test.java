package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<String> tableNames=new ArrayList<>();
        String line=scanner.nextLine();
        String line1;
        while (!line.equals("STOP")){
            line1=line.trim();
            tableNames.add(line1);


            line=scanner.nextLine();
        }

        ArrayList<String> tableNamesSecond=new ArrayList<>();
        String text=scanner.nextLine();
        String text1;
        while (!text.equals("END")){
            text1=text.trim();
            tableNamesSecond.add(text1);

            text=scanner.nextLine();
        }

        for (String tableName : tableNames) {
            if(!tableNamesSecond.contains(tableName)){
                System.out.println(tableName);
            }
        }


    }
}
