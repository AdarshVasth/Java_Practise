import java.util.Scanner;

/**
 * 20. HCF (GCD) Of Two Numbers Program
 * Using Euclidean algorithm
 */
public class HcfOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = Math.abs(in.nextInt());
        System.out.print("Enter second number: ");
        int b = Math.abs(in.nextInt());

        int num1 = a;
        int num2 = b;

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        System.out.println("HCF (GCD) of " + num1 + " and " + num2 + " is: " + a);
        in.close();
    }
}
