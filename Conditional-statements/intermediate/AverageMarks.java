import java.util.Scanner;

/**
 * 12. Calculate Average Marks
 */
public class AverageMarks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Number of subjects must be greater than 0.");
        } else {
            double totalMarks = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter marks for subject " + i + ": ");
                totalMarks += in.nextDouble();
            }
            double average = totalMarks / n;
            System.out.printf("Total Marks: %.2f%n", totalMarks);
            System.out.printf("Average Marks: %.2f%n", average);
        }
        in.close();
    }
}
