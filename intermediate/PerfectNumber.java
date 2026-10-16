import java.util.Scanner;

/**
 * 23. Perfect Number In Java
 * A number whose sum of proper positive divisors equals the number itself.
 * Example: 6 = 1 + 2 + 3, 28 = 1 + 2 + 4 + 7 + 14.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Perfect numbers are positive integers.");
        } else {
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }

            if (sum == n) {
                System.out.println(n + " is a PERFECT NUMBER.");
            } else {
                System.out.println(n + " is NOT a perfect number.");
            }
        }
        in.close();
    }
}
