import java.util.Scanner;

/**
 * 21. Fibonacci Series In Java Programs
 * Series: 0, 1, 1, 2, 3, 5, 8, 13, ...
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms (n): ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else if (n == 1) {
            System.out.println("Fibonacci Series: 0");
        } else {
            long a = 0;
            long b = 1;
            System.out.print("Fibonacci Series: " + a + " " + b);

            for (int i = 3; i <= n; i++) {
                long c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
            System.out.println();
        }
        in.close();
    }
}
