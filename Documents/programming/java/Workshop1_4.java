import java.util.Date;

class Account {
    private int id;
    protected double balance;
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

class SavingsAccount extends Account {

    void withdraw(double am) {
        System.out.println("Withdrawing $" + am);
        balance -= am;
        if (balance < 0) {
            System.out.println("Balance in minus...this is Savings Account.");
        }
    }
}

class CheckingAccount extends Account {

    void withdraw(double am) {
        System.out.println("Withdrawing $" + am);
        balance -= am;
        if (balance < 0) {
            balance += am;
            System.out.println("Overdrawn!!! this is Checking Account...");
        }
    }

}

public class Workshop1_4 {
    public static void main(String[] args) {

        Account obj1 = new Account();
        SavingsAccount obj2 = new SavingsAccount();
        CheckingAccount obj3 = new CheckingAccount();
        obj2.Account();
        obj2.withdraw(5);
        obj2.getInformation();

        obj3.Account();
        obj3.withdraw(5);
        obj2.getInformation();

    }
}