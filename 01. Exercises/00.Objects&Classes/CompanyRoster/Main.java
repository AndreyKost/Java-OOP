package CompanyRoster;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=Integer.parseInt(scanner.nextLine());

        HashMap<String, Department> departments=new HashMap<>();


        while (N-- >0){
            String tokens[]=scanner.nextLine().split("\\s+");
            String departmentName=tokens[3];
            Employee emp=new Employee(
                    tokens[0],
                    Double.parseDouble(tokens[1]),
                    tokens[2]
            );

            if(tokens.length==5){
                if(Character.isDigit(tokens[4].charAt(0))){
                    emp.setAge(Integer.parseInt(tokens[4]));
                } else {
                    emp.setEmail(tokens[4]);
                }
            } else if(tokens.length==6){
                emp.setEmail(tokens[4]);
                emp.setAge(Integer.parseInt(tokens[5]));
            }

            if(!departments.containsKey(departmentName)){
                departments.put(departmentName,new Department());
            }

            departments.get(departmentName).addEmployee(emp);

        }

        departments.entrySet().stream().sorted((f, s) -> {
            int result = Double.compare(s.getValue().getAverageSalary(), f.getValue().getAverageSalary());
            return result;
        }).limit(1).forEach(entry ->{
        System.out.println(String.format("Highest Average Salary: %s",entry.getKey()));
        entry.getValue().getEmployees()
                .stream()
    .sorted((f,s)->{
        int result=Double.compare(s.getSalary(),f.getSalary());
        return result;
        }).forEach(employee-> {
            System.out.printf("%s %.2f %s %d%n"
                    , employee.getName()
                    , employee.getSalary()
                    , employee.getEmail()
                    , employee.getAge());
        });


        });


    }
}
