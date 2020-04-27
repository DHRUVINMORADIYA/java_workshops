import java.io.*;
import java.net.*;
import java.util.Date;
import java.util.Scanner;

public class Server {

    String name;
    Date created = new Date();

    void show() {
        System.out.println("Connection from Socket at " + created);
    }

    public static void main(String[] args) {
        try {

            Scanner obj = new Scanner(System.in);
            ServerSocket ss = new ServerSocket(1234);
            Date created = new Date();
            System.out.println("MultiThreadServer started at " + created);

            Socket s1 = ss.accept();
            DataInputStream in1 = new DataInputStream(s1.getInputStream());
            DataOutputStream out1 = new DataOutputStream(s1.getOutputStream());
            Server client1 = new Server();
            client1.name = (String) in1.readUTF();
            client1.show();

            Socket s2 = ss.accept();
            DataInputStream in2 = new DataInputStream(s2.getInputStream());
            DataOutputStream out2 = new DataOutputStream(s2.getOutputStream());
            Server client2 = new Server();
            client2.name = (String) in2.readUTF();
            client2.show();
            String msg;

            while (true) {

                msg = (String) in1.readUTF();
                System.out.println(client1.name + " : " + msg);
                out2.writeUTF(client1.name + " : " + msg);

                msg = (String) in2.readUTF();
                System.out.println(client2.name + " : " + msg);
                out1.writeUTF(client2.name + " : " + msg);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}