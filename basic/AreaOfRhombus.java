import java.util.Scanner;

/**
 * 6. Area Of Rhombus
 * Formula: Area = (d1 * d2) / 2
 * where d1 and d2 are diagonals of the rhombus.
 */
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first diagonal (d1): ");
        double d1 = in.nextDouble();
        System.out.print("Enter second diagonal (d2): ");
        double d2 = in.nextDouble();

        double area = (d1 * d2) / 2.0;
        System.out.printf("Area of Rhombus: %.4f%n", area);
        in.close();
    }
}
