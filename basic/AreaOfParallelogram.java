import java.util.Scanner;

/**
 * 5. Area Of Parallelogram
 * Formula: Area = base * height
 */
public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base of parallelogram: ");
        double base = in.nextDouble();
        System.out.print("Enter height of parallelogram: ");
        double height = in.nextDouble();

        double area = base * height;
        System.out.printf("Area of Parallelogram: %.4f%n", area);
        in.close();
    }
}
