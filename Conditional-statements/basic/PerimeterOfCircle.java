import java.util.Scanner;

/**
 * 8. Perimeter (Circumference) Of Circle
 * Formula: Perimeter = 2 * PI * radius
 */
public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = in.nextDouble();

        double perimeter = 2 * Math.PI * radius;
        System.out.printf("Perimeter of Circle: %.4f%n", perimeter);
        in.close();
    }
}
