package Bank;

public class BankAccount {
    private static int idCounter=1;
    private static final double DEFAULT_INTEREST_RATE=0.02;

    private int id;
    private double balance;
    private static double interestRate=DEFAULT_INTEREST_RATE;

    public BankAccount(){
        this.id=idCounter++;

    }

    public int getId(){
        return this.id;
    }

    public static void setInterestRate(double interest){
        BankAccount.interestRate=interest;
    }
    public double getInterestRate(int years){
        return BankAccount.interestRate*years*this.balance;
    }


    public void deposit(double amount){
        this.balance+=amount;
    }

}
