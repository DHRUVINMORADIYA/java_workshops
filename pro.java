import java.util.Scanner;

public class pro {

    static String s;

    static String[] words = { "hello", "leonard", "do", "you", "like", "my", "bongos" };

    static boolean ccc(int start) {

        if (start == s.length())
            return true;

        for (int i = 0; i < words.length; i++) {
            int len = words[i].length();
            for (int j = 0; j < words[i].length(); j++) {

                if (start + j < s.length() && words[i].charAt(j) == s.charAt(start + j)) {
                    len--;
                }
            }
            if (len == 0) {
                System.out.print(words[i] + " ");
                return ccc(start + words[i].length());
            }
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("\n");

        while (true) {
            System.out.println("your words are: hello leonard do you like my bongos");
            System.out.print("Enter your string or ctrl+c to exit: ");
            s = in.nextLine();

            boolean check = ccc(0);
            if (check)
                System.out.print("......string exists");
            else
                System.out.print("......string not exists");

            System.out.print("\n");

        }
    }
}