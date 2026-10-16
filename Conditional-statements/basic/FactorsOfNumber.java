import java.util.Scanner;

/**
 * 23. Input a number and print all the factors of that number (use loops).
 */
public class FactorsOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        System.out.print("Factors of " + n + " are: ");
        int num = Math.abs(n);
        if (num == 0) {
            System.out.println("Every non-zero number is a factor of 0.");
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
