package sortByNameAndAge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(reader.readLine());

        List<Person> listOfPersons=new ArrayList<>();

        for (int i = 0; i <n ; i++) {
            String tokens[]=reader.readLine().split("\\s+");
            Person person=new Person(tokens[0],tokens[1],Integer.parseInt(tokens[2]));
            listOfPersons.add(person);
        }

        listOfPersons.stream().sorted((f,s)-> {
            int result=f.getFirstName().compareTo(s.getFirstName());
            if(result==0){
                result=Integer.compare(f.getAge(),s.getAge());
                return result;
            }
            return result;

        }).forEach(e -> {
            System.out.println(e.toString());
        });



    }
}
