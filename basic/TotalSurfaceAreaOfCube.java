import java.util.Scanner;

/**
 * 20. Total Surface Area Of Cube
 * Formula: TSA = 6 * side^2
 */
public class TotalSurfaceAreaOfCube {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side length of cube: ");
        double side = in.nextDouble();

        double tsa = 6 * side * side;
        System.out.printf("Total Surface Area of Cube: %.4f%n", tsa);
        in.close();
    }
}
