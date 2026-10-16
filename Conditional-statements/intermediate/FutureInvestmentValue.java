import java.util.Scanner;

/**
 * 19. Future Investment Value
 * Formula: FV = PV * (1 + annualRate / 100)^years
 */
public class FutureInvestmentValue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter present investment amount: ");
        double pv = in.nextDouble();
        System.out.print("Enter annual interest rate (%): ");
        double rate = in.nextDouble();
        System.out.print("Enter time period (in years): ");
        double years = in.nextDouble();

        double fv = pv * Math.pow(1 + (rate / 100.0), years);
        System.out.printf("Future Investment Value: %.2f%n", fv);
        in.close();
    }
}
