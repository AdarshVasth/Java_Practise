import java.util.Scanner;

/**
 * 22. Subtract the Product and Sum of Digits of an Integer
 * LeetCode 1281: Given an integer number n, return the difference
 * between the product of its digits and the sum of its digits.
 */
public class SubtractProductAndSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        int temp = Math.abs(n);
        int product = 1;
        int sum = 0;

        if (temp == 0) {
            product = 0;
            sum = 0;
        } else {
            while (temp > 0) {
                int digit = temp % 10;
                product *= digit;
                sum += digit;
                temp /= 10;
            }
        }

        int result = product - sum;
        System.out.println("Product of digits: " + product);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Result (Product - Sum): " + result);
        in.close();
    }
}
