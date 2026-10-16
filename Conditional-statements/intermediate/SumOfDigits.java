import java.util.Scanner;

/**
 * 25. Sum Of Digits Of A Number
 */
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        int temp = Math.abs(n);
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        System.out.println("Sum of digits of " + n + " is: " + sum);
        in.close();
    }
}
