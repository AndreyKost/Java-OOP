package Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Map<Integer, BankAccount> bankAccountMap=new HashMap<>();

        String line=scanner.nextLine();
        while (!line.equals("End")){
            String tokens[]= line.split("\\s+");

            switch (tokens.length){
                case 1:
                    BankAccount bankAccount=new BankAccount();
                    bankAccountMap.put(bankAccount.getId(),bankAccount);
                    System.out.printf("Account ID%d created%n",bankAccount.getId());
                    break;
                case 2:
                    double rate=Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(rate);
                    break;
                case 3:
                    int id=Integer.parseInt(tokens[1]);
                    if(!bankAccountMap.containsKey(id)){
                        System.out.println("Account does not exist");
                    }
                    else {
                    if(tokens[0].equals("Deposit")){
                            double amount=Double.parseDouble(tokens[2]);
                            bankAccountMap.get(id).deposit(amount);
                            System.out.printf("Deposited %.0f to ID%d%n",amount,id);
                    } else {
                        int years=Integer.parseInt(tokens[2]);
                        System.out.printf("%.2f%n",bankAccountMap.get(id).getInterestRate(years));
                    }
                }

                    break;

            }



            line=scanner.nextLine();
        }



    }
}
