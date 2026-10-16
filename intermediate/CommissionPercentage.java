import java.util.Scanner;

/**
 * 6. Calculate Commission Percentage
 * Formula: Commission Percentage = (Commission Amount / Total Sales) * 100
 */
public class CommissionPercentage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total sales amount: ");
        double totalSales = in.nextDouble();
        System.out.print("Enter commission amount: ");
        double commission = in.nextDouble();

        if (totalSales <= 0) {
            System.out.println("Total sales must be greater than zero.");
        } else {
            double percentage = (commission / totalSales) * 100.0;
            System.out.printf("Commission Percentage: %.2f%%%n", percentage);
        }
        in.close();
    }
}
