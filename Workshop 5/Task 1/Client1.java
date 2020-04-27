import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) {

        try {

            Scanner obj = new Scanner(System.in);
            Socket s1 = new Socket("localhost", 1234);
            DataInputStream in = new DataInputStream(s1.getInputStream());
            DataOutputStream out = new DataOutputStream(s1.getOutputStream());
            System.out.println();

            System.out.print("Enter your name: ");
            String name = obj.nextLine();
            out.writeUTF(name);
            out.flush();

            while (true) {

                System.out.print(name + " : ");
                String msg = obj.nextLine();

                out.writeUTF(msg);
                System.out.println((String) in.readUTF());
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}