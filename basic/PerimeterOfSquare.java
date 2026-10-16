import java.util.Scanner;

/**
 * 12. Perimeter Of Square
 * Formula: Perimeter = 4 * side
 */
public class PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of square: ");
        double side = in.nextDouble();

        double perimeter = 4 * side;
        System.out.printf("Perimeter of Square: %.4f%n", perimeter);
        in.close();
    }
}
