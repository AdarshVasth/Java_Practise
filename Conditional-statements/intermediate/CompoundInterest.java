import java.util.Scanner;

/**
 * 11. Compound Interest Java Program
 * Formula: Amount = P * (1 + r / (100 * n))^(n * t)
 * Compound Interest = Amount - Principal
 */
public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal = in.nextDouble();
        System.out.print("Enter annual interest rate (%): ");
        double rate = in.nextDouble();
        System.out.print("Enter compounding frequency per year (e.g. 1 for annually, 4 for quarterly, 12 for monthly): ");
        int n = in.nextInt();
        System.out.print("Enter time period (years): ");
        double t = in.nextDouble();

        double amount = principal * Math.pow(1 + (rate / (100.0 * n)), n * t);
        double ci = amount - principal;

        System.out.printf("Compound Interest: %.2f%n", ci);
        System.out.printf("Total Amount: %.2f%n", amount);
        in.close();
    }
}
