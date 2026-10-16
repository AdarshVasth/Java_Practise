import java.util.Scanner;

/**
 * 21. LCM Of Two Numbers
 * Formula: LCM(a, b) = (|a * b|) / HCF(a, b)
 */
public class LcmOfTwoNumbers {
    private static int findHcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();

        if (a == 0 || b == 0) {
            System.out.println("LCM of zero with any number is 0.");
        } else {
            int absA = Math.abs(a);
            int absB = Math.abs(b);
            int hcf = findHcf(absA, absB);
            long lcm = ((long) absA * absB) / hcf;

            System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
        }
        in.close();
    }
}
