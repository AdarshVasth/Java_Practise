import java.util.Scanner;

/**
 * 4. Area Of Isosceles Triangle
 * Formula: Area = (base * sqrt(4 * a^2 - base^2)) / 4
 * where 'a' is the length of equal sides, and 'base' is the third side.
 */
public class AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of equal side (a): ");
        double a = in.nextDouble();
        System.out.print("Enter base length (b): ");
        double b = in.nextDouble();

        if (4 * a * a < b * b) {
            System.out.println("Invalid triangle dimensions (equal sides too short).");
        } else {
            double area = (b * Math.sqrt(4 * a * a - b * b)) / 4.0;
            System.out.printf("Area of Isosceles Triangle: %.4f%n", area);
        }
        in.close();
    }
}
