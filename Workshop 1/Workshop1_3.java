import java.util.Scanner;

class Account {
    int id;
    double balance = 100;

    public void account(int i) {
        id = i;
    }

    void withdraw(double am) {
        balance -= am;
    }

    void deposit(double am) {
        balance += am;
    }

}

class Workshop1_3 {
    public static void main(String[] args) {
        Account ar[] = new Account[10];
        for (int i = 0; i < 10; i++) {
            ar[i] = new Account();
            ar[i].account(i);
        }
        Scanner obj = new Scanner(System.in);
        boolean check = true;
        while (check) {
            System.out.println("Enter an id: ");
            int id = obj.nextInt();
            System.out.println();
            System.out.println("Main menu");
            System.out.println("1.check balance");
            System.out.println("2.withdraw");
            System.out.println("3.deposit");
            System.out.println("4.exit");

            System.out.println("Enter a choice: ");
            int choice = obj.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The balance is " + ar[id].balance);
                    break;

                case 2:
                    System.out.println("Enter an amount to withdraw: ");
                    double am = obj.nextDouble();
                    ar[id].withdraw(am);
                    break;

                case 3:
                    System.out.println("Enter an amount to deposit: ");
                    double am1 = obj.nextDouble();
                    ar[id].deposit(am1);
                    break;

                case 4:
                    check = false;
                    break;

                default:
                    System.out.println("!!! Enter the currect choice !!!");
            }
        }
    }
}