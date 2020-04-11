import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class Workshop4_1 {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the year: ");
            int year = obj.nextInt();

            if (year < 2001 || year > 2010) {
                System.out.println("Enter the year between 2001 to 2010.");
                System.out.println("Enter the year: ");
                year = obj.nextInt();
            }

            System.out.println("Enter the gender: ");
            char gender = obj.next().charAt(0);

            if (gender != 'm' && gender != 'f') {
                System.out.println("Enter either f or m.");
                System.out.println("Enter the gender: ");
                gender = obj.next().charAt(0);
            }

            Scanner newobj = new Scanner(System.in);
            System.out.println("Enter the name: ");
            String name = newobj.nextLine();

            switch (year) {
                case 2001:
                    try {
                        File newfile = new File("babynameranking2001.txt");
                        Scanner reader = new Scanner(newfile);

                        for (int i = 1; i <= 1000; i++) {
                            String data = reader.nextLine();
                            String[] dataarray = data.split(" ");

                            if (name.equals(dataarray[1])) {
                                System.out.println("Boy name " + name + " is ranked #" + i + " in year 2001");
                                break;
                            } else if (name.equals(dataarray[3])) {
                                System.out.println("Girl name " + name + " is ranked #" + i + " in year 2001");
                                break;
                            } else {
                                System.out.println(
                                        "Sorry, name not found.You can try with entering first alphabet in capital latter.");
                            }

                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Error occured!");
                    }
                    break;

                case 2002:
                    try {
                        File newfile = new File("babynameranking2002.txt");
                        Scanner reader = new Scanner(newfile);

                        for (int i = 1; i <= 1000; i++) {
                            String data = reader.nextLine();
                            String[] dataarray = data.split(" ");

                            if (name.equals(dataarray[1])) {
                                System.out.println("Boy name " + name + " is ranked #" + i + " in year 2002");
                                break;
                            } else if (name.equals(dataarray[3])) {
                                System.out.println("Girl name " + name + " is ranked #" + i + " in year 2002");
                                break;
                            } else {
                                System.out.println(
                                        "Sorry, name not found.You can try with entering first alphabet in capital latter.");
                            }

                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Error occured!");
                    }
                    break;

                case 2003:
                    try {
                        File newfile = new File("babynameranking2003.txt");
                        Scanner reader = new Scanner(newfile);

                        for (int i = 1; i <= 1000; i++) {
                            String data = reader.nextLine();
                            String[] dataarray = data.split(" ");

                            if (name.equals(dataarray[1])) {
                                System.out.println("Boy name " + name + " is ranked #" + i + " in year 2003");
                                break;
                            } else if (name.equals(dataarray[3])) {
                                System.out.println("Girl name " + name + " is ranked #" + i + " in year 2003");
                                break;
                            } else {
                                System.out.println(
                                        "Sorry, name not found.You can try with entering first alphabet in capital latter.");
                            }

                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Error occured!");
                    }
                    break;

                case 2004:
                    try {
                        File newfile = new File("babynameranking2004.txt");
                        Scanner reader = new Scanner(newfile);

                        for (int i = 1; i <= 1000; i++) {
                            String data = reader.nextLine();
                            String[] dataarray = data.split(" ");

                            if (name.equals(dataarray[1])) {
                                System.out.println("Boy name " + name + " is ranked #" + i + " in year 2004");
                                break;
                            } else if (name.equals(dataarray[3])) {
                                System.out.println("Girl name " + name + " is ranked #" + i + " in year 2004");
                                break;
                            } else {
                                System.out.println(
                                        "Sorry, name not found.You can try with entering first alphabet in capital latter.");
                            }

                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Error occured!");
                    }
                    break;

                case 2005:
                    try {
                        File newfile = new File("babynameranking2005.txt");
                        Scanner reader = new Scanner(newfile);

                        for (int i = 1; i <= 1000; i++) {
                            String data = reader.nextLine();
                            String[] dataarray = data.split(" ");

                            if (name.equals(dataarray[1])) {
                                System.out.println("Boy name " + name + " is ranked #" + i + " in year 2005");
                                break;
                            } else if (name.equals(dataarray[3])) {
                                System.out.println("Girl name " + name + " is ranked #" + i + " in year 2005");
                                break;
                            } else {
                                System.out.println(
                                        "Sorry, name not found.You can try with entering first alphabet in capital latter.");
                            }

                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Error occured!");
                    }
                    break;

                case 2006:
                    try {
                        File newfile = new File("babynameranking2006.txt");
                        Scanner reader = new Scanner(newfile);

                        for (int i = 1; i <= 1000; i++) {
                            String data = reader.nextLine();
                            String[] dataarray = data.split(" ");

                            if (name.equals(dataarray[1])) {
                                System.out.println("Boy name " + name + " is ranked #" + i + " in year 2006");
                                break;
                            } else if (name.equals(dataarray[3])) {
                                System.out.println("Girl name " + name + " is ranked #" + i + " in year 2006");
                                break;
                            } else {
                                System.out.println(
                                        "Sorry, name not found.You can try with entering first alphabet in capital latter.");
                            }

                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Error occured!");
                    }
                    break;

                case 2007:
                    try {
                        File newfile = new File("babynameranking2007.txt");
                        Scanner reader = new Scanner(newfile);

                        for (int i = 1; i <= 1000; i++) {
                            String data = reader.nextLine();
                            String[] dataarray = data.split(" ");

                            if (name.equals(dataarray[1])) {
                                System.out.println("Boy name " + name + " is ranked #" + i + " in year 2007");
                                break;
                            } else if (name.equals(dataarray[3])) {
                                System.out.println("Girl name " + name + " is ranked #" + i + " in year 2007");
                                break;
                            } else {
                                System.out.println(
                                        "Sorry, name not found.You can try with entering first alphabet in capital latter.");
                            }

                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Error occured!");
                    }
                    break;

                case 2008:
                    try {
                        File newfile = new File("babynameranking2008.txt");
                        Scanner reader = new Scanner(newfile);

                        for (int i = 1; i <= 1000; i++) {
                            String data = reader.nextLine();
                            String[] dataarray = data.split(" ");

                            if (name.equals(dataarray[1])) {
                                System.out.println("Boy name " + name + " is ranked #" + i + " in year 2008");
                                break;
                            } else if (name.equals(dataarray[3])) {
                                System.out.println("Girl name " + name + " is ranked #" + i + " in year 2008");
                                break;
                            } else {
                                System.out.println(
                                        "Sorry, name not found.You can try with entering first alphabet in capital latter.");
                            }

                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Error occured!");
                    }
                    break;

                case 2009:
                    try {
                        File newfile = new File("babynameranking2009.txt");
                        Scanner reader = new Scanner(newfile);

                        for (int i = 1; i <= 1000; i++) {
                            String data = reader.nextLine();
                            String[] dataarray = data.split(" ");

                            if (name.equals(dataarray[1])) {
                                System.out.println("Boy name " + name + " is ranked #" + i + " in year 2009");
                                break;
                            } else if (name.equals(dataarray[3])) {
                                System.out.println("Girl name " + name + " is ranked #" + i + " in year 2009");
                                break;
                            } else {
                                System.out.println(
                                        "Sorry, name not found.You can try with entering first alphabet in capital latter.");
                            }

                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Error occured!");
                    }
                    break;

                case 2010:
                    try {
                        File newfile = new File("babynameranking2010.txt");
                        Scanner reader = new Scanner(newfile);

                        for (int i = 1; i <= 1000; i++) {
                            String data = reader.nextLine();
                            String[] dataarray = data.split(" ");

                            if (name.equals(dataarray[1])) {
                                System.out.println("Boy name " + name + " is ranked #" + i + " in year 2010");
                                break;
                            } else if (name.equals(dataarray[3])) {
                                System.out.println("Girl name " + name + " is ranked #" + i + " in year 2010");
                                break;
                            } else {
                                System.out.println(
                                        "Sorry, name not found.You can try with entering first alphabet in capital latter.");
                            }

                        }
                    } catch (FileNotFoundException e) {
                        System.out.println("Error occured!");
                    }
                    break;

            }

            System.out.println("Enter another inquiry?");

            char yorn = obj.next().charAt(0);
            if (yorn == 'N' || yorn == 'n') {
                break;
            }
        }

    }
}