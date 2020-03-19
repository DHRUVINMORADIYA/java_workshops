import java.util.Scanner;

class Location {
    int row;
    int column;
    double maxValue;

    void locateLargest(double[][] a) {

        double[] max = new double[a.length];

        for (int i = 0; i < a.length; i++) {

            max[i] = a[i][0];
            for (int j = 0; j < a[0].length; j++) {
                if (max[i] < a[i][j]) {
                    max[i] = a[i][j];
                    column = j;
                }
            }
        }
        double maxValue = max[0];
        for (int i = 0; i < a.length; i++) {
            if (maxValue < max[i]) {
                maxValue = max[i];
                row = i;
            }
        }
        System.out.println(
                "The location of the largest element is " + maxValue + " at " + "(" + row + "," + column + ")");

    }
}

public class Workshop1_1 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array: ");
        int r = obj.nextInt();
        int c = obj.nextInt();

        System.out.println("Enter the array: ");

        double[][] numbers = new double[r][c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                numbers[i][j] = obj.nextDouble();
            }
        }

        Location first = new Location();
        first.locateLargest(numbers);

    }
}