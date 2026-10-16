import java.util.Scanner;

/**
 * 25. Take integer inputs till the user enters 0 and print the largest number from all.
 */
public class LargestUntilZero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer largest = null;

        System.out.println("Enter integers (enter 0 to finish):");
        while (true) {
            int num = in.nextInt();
            if (num == 0) {
                break;
            }
            if (largest == null || num > largest) {
                largest = num;
            }
        }

        if (largest == null) {
            System.out.println("No non-zero numbers were entered.");
        } else {
            System.out.println("Largest number: " + largest);
        }
        in.close();
    }
}
