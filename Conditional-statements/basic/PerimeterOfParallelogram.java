import java.util.Scanner;

/**
 * 10. Perimeter Of Parallelogram
 * Formula: Perimeter = 2 * (sideA + sideB)
 */
public class PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of side a: ");
        double a = in.nextDouble();
        System.out.print("Enter length of adjacent side b: ");
        double b = in.nextDouble();

        double perimeter = 2 * (a + b);
        System.out.printf("Perimeter of Parallelogram: %.4f%n", perimeter);
        in.close();
    }
}
