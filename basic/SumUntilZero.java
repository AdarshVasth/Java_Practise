import java.util.Scanner;

/**
 * 24. Take integer inputs till the user enters 0 and print the sum of all numbers
 * (HINT: while loop)
 */
public class SumUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter integers (enter 0 to finish):");
        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
        }

        System.out.println("Sum of all numbers: " + sum);
        in.close();
    }
}
