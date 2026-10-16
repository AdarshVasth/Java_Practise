import java.util.Scanner;

/**
 * 7. Area Of Equilateral Triangle
 * Formula: Area = (sqrt(3) / 4) * side^2
 */
public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of equilateral triangle: ");
        double side = in.nextDouble();

        double area = (Math.sqrt(3) / 4.0) * side * side;
        System.out.printf("Area of Equilateral Triangle: %.4f%n", area);
        in.close();
    }
}
