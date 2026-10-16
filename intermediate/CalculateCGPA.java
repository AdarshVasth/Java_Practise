import java.util.Scanner;

/**
 * 10. Calculate CGPA Java Program
 * Formula: CGPA = Sum of Grade Points / Total Subjects
 */
public class CalculateCGPA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of subjects: ");
        int n = in.nextInt();

        if (n <= 0) {
            System.out.println("Number of subjects must be greater than 0.");
        } else {
            double totalGradePoints = 0;
            for (int i = 1; i <= n; i++) {
                System.out.print("Enter grade point for subject " + i + " (out of 10): ");
                totalGradePoints += in.nextDouble();
            }
            double cgpa = totalGradePoints / n;
            double percentage = cgpa * 9.5; // Standard conversion factor
            System.out.printf("CGPA: %.2f%n", cgpa);
            System.out.printf("Equivalent Percentage: %.2f%%%n", percentage);
        }
        in.close();
    }
}
