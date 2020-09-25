package OpinionPoll;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());
        Map<String, Integer> mapPersons=new TreeMap<>();

        while (N-- >0){
            String line=scanner.nextLine();
            String tokens[]=line.split("\\s+");
            String name=tokens[0];
            int age=Integer.parseInt(tokens[1]);
            Person person=new Person(name,age);
            mapPersons.put(person.getName(),person.getAge());

        }

        for (Map.Entry<String, Integer> entry : mapPersons.entrySet()) {
            if(entry.getValue()>30){
                System.out.println(String.format("%s - %d",entry.getKey(),entry.getValue()));
            }
        }


    }
}
