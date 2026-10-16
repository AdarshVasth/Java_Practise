import java.util.Scanner;

/**
 * 2. Calculate Electricity Bill
 * Example slab rates:
 * First 100 units: Rs 1.5/unit
 * Next 100 units (101-200): Rs 2.5/unit
 * Next 100 units (201-300): Rs 4.0/unit
 * Above 300 units: Rs 6.0/unit
 * Fixed meter charge: Rs 50
 */
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter electricity units consumed: ");
        double units = in.nextDouble();

        double bill = 50.0; // Fixed charge

        if (units <= 100) {
            bill += units * 1.5;
        } else if (units <= 200) {
            bill += (100 * 1.5) + (units - 100) * 2.5;
        } else if (units <= 300) {
            bill += (100 * 1.5) + (100 * 2.5) + (units - 200) * 4.0;
        } else {
            bill += (100 * 1.5) + (100 * 2.5) + (100 * 4.0) + (units - 300) * 6.0;
        }

        System.out.printf("Total Electricity Bill: Rs. %.2f%n", bill);
        in.close();
    }
}
