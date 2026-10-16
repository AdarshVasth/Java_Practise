import java.util.Scanner;

/**
 * 3. Calculate Average Of N Numbers
 */
public class AverageOfNNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter count of numbers (N): ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("N must be greater than 0.");
        } else {
            double sum = 0;
            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                sum += in.nextDouble();
            }
            double average = sum / n;
            System.out.printf("Average of %d numbers: %.4f%n", n, average);
        }
        in.close();
    }
}
