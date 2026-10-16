import java.util.Scanner;

/**
 * 27. Write a program to print the sum of negative numbers,
 * sum of positive even numbers and the sum of positive odd numbers
 * from a list of numbers (N) entered by the user.
 * The list terminates when the user enters a zero.
 */
public class SumOfNumbersCategories {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sumNegative = 0;
        int sumPositiveEven = 0;
        int sumPositiveOdd = 0;

        System.out.println("Enter numbers one by one (enter 0 to terminate):");
        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                break;
            }

            if (num < 0) {
                sumNegative += num;
            } else {
                if (num % 2 == 0) {
                    sumPositiveEven += num;
                } else {
                    sumPositiveOdd += num;
                }
            }
        }

        System.out.println("Sum of Negative Numbers: " + sumNegative);
        System.out.println("Sum of Positive Even Numbers: " + sumPositiveEven);
        System.out.println("Sum of Positive Odd Numbers: " + sumPositiveOdd);
        in.close();
    }
}
