import java.util.Scanner;

/**
 * 15. Armstrong Number In Java
 * An Armstrong number is equal to the sum of its digits raised to the power of the number of digits.
 * Example: 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
 */
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        int temp = n;
        int digits = 0;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, digits);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println(n + " is an Armstrong Number.");
        } else {
            System.out.println(n + " is NOT an Armstrong Number.");
        }
        in.close();
    }
}
