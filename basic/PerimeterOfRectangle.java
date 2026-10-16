import java.util.Scanner;

/**
 * 11. Perimeter Of Rectangle
 * Formula: Perimeter = 2 * (length + breadth)
 */
public class PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = in.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = in.nextDouble();

        double perimeter = 2 * (length + breadth);
        System.out.printf("Perimeter of Rectangle: %.4f%n", perimeter);
        in.close();
    }
}
