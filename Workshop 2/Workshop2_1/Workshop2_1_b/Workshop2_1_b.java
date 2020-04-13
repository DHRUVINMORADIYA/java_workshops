import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class Workshop2_1_b {
    public static void main(String[] args) {

        try {
            File myobj = new File("Hangman.txt");
            Scanner myreader = new Scanner(myobj);
            String data = myreader.nextLine();
            String[] word = data.split(" ");

            for (int j = 0; j < word.length; j++) {

                int lengthofword = word[j].length();
                boolean forwhile = true;
                Scanner scan = new Scanner(System.in);
                int counter = 0;
                int missingcounter = 0;

                char[] wordinchar = new char[lengthofword];
                for (int i = 0; i < lengthofword; i++) {
                    wordinchar[i] = '*';
                }

                while (forwhile) {

                    System.out.print("(Guess) Enter a letter in word ");
                    for (int i = 0; i < lengthofword; i++) {
                        System.out.print(wordinchar[i]);
                    }
                    System.out.print(" > ");

                    char wordtotry = scan.next().charAt(0);
                    int counter1 = counter;

                    for (int i = 0; i < lengthofword; i++) {
                        if (wordtotry == wordinchar[i]) {
                            System.out.print(wordtotry + " is already in the word");
                            System.out.println();
                            break;
                        }
                        if (wordtotry == word[j].charAt(i)) {
                            wordinchar[i] = wordtotry;
                            counter++;
                        }
                        if ((i == (lengthofword - 1)) && (counter1 == counter)) {
                            System.out.print(wordtotry + " is not in the word");
                            System.out.println();
                            missingcounter++;
                        }
                    }

                    if (counter == lengthofword) {
                        System.out.print("The word is " + word[j] + ". You missed " + missingcounter + " time");
                        forwhile = false;
                    }
                }
                System.out.println();
                System.out.print("Do you want to guess another word? Enter y or n>");
                char guessnewword = scan.next().charAt(0);
                while (guessnewword != 'n' && guessnewword != 'y') {
                    System.out.println("Invalid Entry...");
                    guessnewword = scan.next().charAt(0);
                }
                if (guessnewword == 'n') {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occured.");
            e.printStackTrace();
        }
    }
}