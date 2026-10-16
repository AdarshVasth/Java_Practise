import java.util.Scanner;

/**
 * 9. Perimeter Of Equilateral Triangle
 * Formula: Perimeter = 3 * side
 */
public class PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of equilateral triangle: ");
        double side = in.nextDouble();

        double perimeter = 3 * side;
        System.out.printf("Perimeter of Equilateral Triangle: %.4f%n", perimeter);
        in.close();
    }
}
