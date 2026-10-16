import java.util.Scanner;

/**
 * 2. Area Of Triangle
 * Formula: Area = 0.5 * base * height
 */
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base of the triangle: ");
        double base = in.nextDouble();
        System.out.print("Enter height of the triangle: ");
        double height = in.nextDouble();

        double area = 0.5 * base * height;
        System.out.printf("Area of Triangle: %.4f%n", area);
        in.close();
    }
}
