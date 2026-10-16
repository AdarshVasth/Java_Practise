import java.util.Scanner;

/**
 * 13. Perimeter Of Rhombus
 * Formula: Perimeter = 4 * side
 */
public class PerimeterOfRhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter side of rhombus: ");
        double side = in.nextDouble();

        double perimeter = 4 * side;
        System.out.printf("Perimeter of Rhombus: %.4f%n", perimeter);
        in.close();
    }
}
