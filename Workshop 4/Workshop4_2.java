import java.util.Scanner;

public class Workshop4_2 {

    static void printgrid(char ar[][]) {
        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 7; j++) {
                System.out.print("|");
                System.out.print(ar[i][j]);
            }
            System.out.print("|");
            System.out.println();
        }
        System.out.println("---------------");
    }

    public static void main(String[] args) {

        char[][] ar = new char[10][11];

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 10; j++) {
                ar[i][j] = ' ';
            }
        }

        boolean check = true;
        boolean rory = true;
        Scanner obj = new Scanner(System.in);

        while (check) {
            printgrid(ar);
            if (rory == true) {
                System.out.println("Drop a red disk at column (1-7): ");
                rory = false;
            } else {
                System.out.println("Drop a yellow disk at column (1-7): ");
                rory = true;
            }

            int option = obj.nextInt();
            if (option < 1 || option > 7) {
                do {
                    System.out.println("Enter the number between 1 to 7.");
                    option = obj.nextInt();
                } while (option < 1 || option > 7);
            }

            for (int i = 6; i > 0; i--) {
                if (ar[i][option] == ' ') {
                    if (rory == false) {
                        ar[i][option] = 'R';
                        break;
                    } else {
                        ar[i][option] = 'Y';
                        break;
                    }
                }
            }
            for (int i = 6; i > 0; i--) {
                for (int j = 1; j <= 7; j++) {
                    if (ar[i][j] != ' ') {
                        if (ar[i][j] == ar[i][j + 1] && ar[i][j] == ar[i][j + 2] && ar[i][j] == ar[i][j + 3]) {
                            if (ar[i][j] == 'R') {
                                printgrid(ar);
                                System.out.println("The red player won.");
                                j = 8;
                                i = 0;
                                check = false;
                            } else {
                                printgrid(ar);
                                System.out.println("The yellow player won.");
                                j = 8;
                                i = 0;
                                check = false;
                            }
                        } else if (ar[i][j] == ar[i - 1][j + 1] && ar[i][j] == ar[i - 2][j + 2]
                                && ar[i][j] == ar[i - 3][j + 3]) {
                            if (ar[i][j] == 'R') {
                                printgrid(ar);
                                System.out.println("The red player won.");
                                j = 8;
                                i = 0;
                                check = false;
                            } else {
                                printgrid(ar);
                                System.out.println("The yellow player won.");
                                j = 8;
                                i = 0;
                                check = false;
                            }
                        } else if (ar[i][j] == ar[i - 1][j] && ar[i][j] == ar[i - 2][j] && ar[i][j] == ar[i - 3][j]) {
                            if (ar[i][j] == 'R') {
                                printgrid(ar);
                                System.out.println("The red player won.");
                                j = 8;
                                i = 0;
                                check = false;
                            } else {
                                printgrid(ar);
                                System.out.println("The yellow player won.");
                                j = 8;
                                i = 0;
                                check = false;
                            }
                        } else if (ar[i][j] == ar[i + 1][j + 1] && ar[i][j] == ar[i + 2][j + 2]
                                && ar[i][j] == ar[i + 3][j + 3]) {
                            if (ar[i][j] == 'R') {
                                printgrid(ar);
                                System.out.println("The red player won.");
                                j = 8;
                                i = 0;
                                check = false;
                            } else {
                                printgrid(ar);
                                System.out.println("The yellow player won.");
                                j = 8;
                                i = 0;
                                check = false;
                            }
                        }
                    }
                }
            }

        }
    }
}