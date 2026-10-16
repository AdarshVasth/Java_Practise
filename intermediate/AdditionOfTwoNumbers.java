import java.util.Scanner;

/**
 * 13. Addition Of Two Numbers
 */
public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = in.nextDouble();
        System.out.print("Enter second number: ");
        double b = in.nextDouble();

        double sum = a + b;
        System.out.println("Sum: " + sum);
        in.close();
    }
}
