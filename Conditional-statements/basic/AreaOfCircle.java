import java.util.Scanner;

/**
 * 1. Area Of Circle Java Program
 * Formula: Area = PI * radius^2
 */
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        double radius = in.nextDouble();

        double area = Math.PI * radius * radius;
        System.out.printf("Area of Circle: %.4f%n", area);
        in.close();
    }
}
