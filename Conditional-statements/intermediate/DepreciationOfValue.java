import java.util.Scanner;

/**
 * 8. Calculate Depreciation of Value
 * Formula: Depreciated Value = Initial Value * (1 - rate / 100)^time
 */
public class DepreciationOfValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter initial asset value: ");
        double initialValue = in.nextDouble();
        System.out.print("Enter annual depreciation rate (%): ");
        double rate = in.nextDouble();
        System.out.print("Enter time period (years): ");
        double years = in.nextDouble();

        double depreciatedValue = initialValue * Math.pow(1 - (rate / 100.0), years);
        System.out.printf("Value after %.1f years: %.2f%n", years, depreciatedValue);
        System.out.printf("Total Depreciation: %.2f%n", (initialValue - depreciatedValue));
        in.close();
    }
}
