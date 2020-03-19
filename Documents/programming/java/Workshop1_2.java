import java.util.Date;

class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    void Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    void Account(int i, double b, double air) {
        id = i;
        balance = b;
        annualInterestRate = air;
    }

    double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    double getMonthlyInterest() {
        return balance * (annualInterestRate / 1200);
    }

    void withdraw(double am) {
        System.out.println("Withdrawing $" + am);
        balance -= am;
    }

    void deposit(double am) {
        System.out.println("depositing $" + am);
        balance += am;
    }

    void getInformation() {
        System.out.println();
        System.out.println("Account ID: $" + id);
        System.out.println("Balance: $" + balance);
        System.out.println("Monthly Interest Rate: " + annualInterestRate / 12 + "%");
        System.out.println("Created on: " + dateCreated);
    }
}

public class Workshop1_2 {
    public static void main(String[] args) {
        Account obj1 = new Account();
        int i = 1112;
        double b = 20000;
        double air = 4.5;
        obj1.Account();
        obj1.Account(i, b, air);
        System.out.println("Monthly interest rate: " + obj1.getMonthlyInterestRate() + "%");
        System.out.println("Monthly interest: $" + obj1.getMonthlyInterest());
        obj1.withdraw(2500);
        obj1.deposit(3000);
        obj1.getInformation();
    }
}