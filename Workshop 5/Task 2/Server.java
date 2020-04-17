import java.io.*;
import java.net.*;
import java.util.Date;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(1234);
            Date created = new Date();
            System.out.println("BMICalculatorServer started at " + created);
            System.out.println();

            Socket s = ss.accept();
            created = new Date();
            System.out.println("BMICalculatorServer started at " + created);
            System.out.println();

            DataInputStream dis = new DataInputStream(s.getInputStream());

            System.out.println("Waiting for height and weight from client:");
            System.out.println();

            System.out.print("Height is: ");
            double height = (double) dis.readDouble();
            System.out.print(height);
            System.out.println();

            System.out.print("Weight is: ");
            double weight = (double) dis.readDouble();
            System.out.print(weight);
            System.out.println();

            double bmi = weight / (height * height);
            System.out.print("Calculating BMI...");
            System.out.println();

            DataOutputStream dis1 = new DataOutputStream(s.getOutputStream());
            if (bmi < 18.5) {
                dis1.writeUTF("Underweight");
            } else if (bmi >= 18.5 && bmi < 25.0) {
                dis1.writeUTF("Normal");
            } else if (bmi >= 25.0 && bmi < 30.0) {
                dis1.writeUTF("Overweight");
            } else {
                dis1.writeUTF("Oberse");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}