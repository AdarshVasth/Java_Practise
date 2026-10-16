import java.util.Scanner;

/**
 * 9. Calculate Batting Average
 * Formula: Batting Average = Total Runs Scored / Number of Times Dismissed (Out)
 */
public class BattingAverage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter total runs scored: ");
        int runs = in.nextInt();
        System.out.print("Enter number of dismissals (outs): ");
        int outs = in.nextInt();

        if (outs <= 0) {
            System.out.println("Dismissals must be greater than 0 to calculate average.");
        } else {
            double avg = (double) runs / outs;
            System.out.printf("Batting Average: %.2f%n", avg);
        }
        in.close();
    }
}
