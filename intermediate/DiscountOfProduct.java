import java.util.Scanner;

/**
 * 4. Calculate Discount Of Product
 * Formula: Discount Amount = Marked Price * (Discount Percentage / 100)
 * Final Price = Marked Price - Discount Amount
 */
public class DiscountOfProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter marked price of product: ");
        double markedPrice = in.nextDouble();
        System.out.print("Enter discount percentage (%): ");
        double discountPercent = in.nextDouble();

        double discountAmount = markedPrice * (discountPercent / 100.0);
        double finalPrice = markedPrice - discountAmount;

        System.out.printf("Discount Amount: %.2f%n", discountAmount);
        System.out.printf("Final Selling Price: %.2f%n", finalPrice);
        in.close();
    }
}
