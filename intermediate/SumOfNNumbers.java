import java.util.Scanner;

/**
 * 14. Sum Of N Numbers
 */
public class SumOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total count of numbers (N): ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("N must be positive.");
        } else {
            double sum = 0;
            System.out.println("Enter " + n + " numbers:");
            for (int i = 1; i <= n; i++) {
                sum += in.nextDouble();
            }
            System.out.printf("Sum of %d numbers: %.4f%n", n, sum);
        }
        in.close();
    }
}
