/*
test case:
5 201
25 2 1 100.5 4 320.5
125 2 2 40 3 85
175 2 0 125 3 75
75 1 0 125
181 1 2 125 

ans: 1 and 3
*/

import java.util.Scanner;

class Bank {
    double balance;
    int nobl;
    int[] id;
    double[] amount;
    double totalassets = 0;

    void bank(double b, int n) {
        balance = b;
        nobl = n;
        id = new int[nobl];
        amount = new double[nobl];
    }

    void gettotalassets() {
        totalassets = balance;
        for (int i = 0; i < nobl; i++) {
            totalassets += amount[i];
        }
    }

}

class Workshop2_2 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        int numberofbanks = obj.nextInt();
        double minimumassetlimit = obj.nextDouble();

        boolean[] issafe = new boolean[numberofbanks];
        Bank[] accounts = new Bank[numberofbanks];

        for (int i = 0; i < numberofbanks; i++) {

            issafe[i] = true;
            double b = obj.nextDouble();
            int n = obj.nextInt();

            accounts[i] = new Bank();
            accounts[i].bank(b, n);

            for (int j = 0; j < n; j++) {

                accounts[i].id[j] = obj.nextInt();
                accounts[i].amount[j] = obj.nextDouble();
            }
            accounts[i].gettotalassets();
        }

        boolean check = false;

        while (check == false) {
            int ch = 1;
            for (int i = 0; i < numberofbanks; i++) {
                System.out.println(accounts[i].totalassets);
                if (accounts[i].totalassets < 201 && issafe[i] == true) {
                    ch++;
                    issafe[i] = false;

                    for (int j = 0; j < numberofbanks; j++) {
                        for (int k = 0; k < accounts[j].nobl; k++) {
                            if (accounts[j].id[k] == i) {
                                accounts[j].totalassets -= accounts[j].amount[k];
                            }
                        }
                    }
                }
            }
            if (ch == 1) {
                check = true;
            }
        }
        System.out.println("list of unsafe banks: ");
        for (int i = 0; i < numberofbanks; i++) {
            if (issafe[i] == false) {
                System.out.println(i);
            }
        }
    }
}