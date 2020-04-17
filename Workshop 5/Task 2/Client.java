import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 1234);
            Scanner obj = new Scanner(System.in);
            DataOutputStream dt = new DataOutputStream(s.getOutputStream());

            System.out.print("Write your height in meters (ex 1.80): ");
            double height = obj.nextDouble();
            dt.writeDouble(height);
            dt.flush();

            System.out.print("Write your weight in kilograms (ex 70.5): ");
            double weight = obj.nextDouble();
            dt.writeDouble(weight);
            dt.flush();
            System.out.println();

            System.out.println("Waiting for BMI from server...");

            DataInputStream dt1 = new DataInputStream(s.getInputStream());
            String result = (String) dt1.readUTF();
            System.out.println("Your BMI is: " + result);
            System.out.println();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}