import java.util.Scanner;

/**
 * 5. Calculate Distance Between Two Points
 * Formula: Distance = sqrt((x2 - x1)^2 + (y2 - y1)^2)
 */
public class DistanceBetweenPoints {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter coordinates of point 1 (x1 y1): ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();

        System.out.print("Enter coordinates of point 2 (x2 y2): ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.printf("Distance between points: %.4f%n", distance);
        in.close();
    }
}
