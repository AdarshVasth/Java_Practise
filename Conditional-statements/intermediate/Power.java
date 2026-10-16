import java.util.Scanner;

/**
 * 7. Power In Java
 * Calculate base^exponent
 */
public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = in.nextDouble();
        System.out.print("Enter exponent (integer): ");
        int exp = in.nextInt();

        double result = 1.0;
        int power = Math.abs(exp);
        for (int i = 0; i < power; i++) {
            result *= base;
        }

        if (exp < 0) {
            result = 1.0 / result;
        }

        System.out.printf("%.4f ^ %d = %.6f%n", base, exp, result);
        in.close();
    }
}
