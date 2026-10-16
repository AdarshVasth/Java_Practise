import java.util.Scanner;

/**
 * 16. Find Ncr & Npr
 * Formula:
 * nPr = n! / (n - r)!
 * nCr = n! / (r! * (n - r)!)
 */
public class NcrAndNpr {
    private static long factorial(int num) {
        long fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        System.out.print("Enter r: ");
        int r = in.nextInt();

        if (n < 0 || r < 0 || r > n) {
            System.out.println("Invalid values! Must satisfy 0 <= r <= n.");
        } else {
            long nPr = factorial(n) / factorial(n - r);
            long nCr = factorial(n) / (factorial(r) * factorial(n - r));

            System.out.println("nPr (Permutations): " + nPr);
            System.out.println("nCr (Combinations): " + nCr);
        }
        in.close();
    }
}
