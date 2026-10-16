import java.util.Scanner;

/**
 * 15. Volume Of Prism
 * Formula: Volume = baseArea * height
 */
public class VolumeOfPrism {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base area of prism: ");
        double baseArea = in.nextDouble();
        System.out.print("Enter height of prism: ");
        double height = in.nextDouble();

        double volume = baseArea * height;
        System.out.printf("Volume of Prism: %.4f%n", volume);
        in.close();
    }
}
