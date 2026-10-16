import java.util.Scanner;

/**
 * 18. Volume Of Pyramid
 * Formula: Volume = (1/3) * baseArea * height
 */
public class VolumeOfPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter base area of pyramid: ");
        double baseArea = in.nextDouble();
        System.out.print("Enter height of pyramid: ");
        double height = in.nextDouble();

        double volume = (1.0 / 3.0) * baseArea * height;
        System.out.printf("Volume of Pyramid: %.4f%n", volume);
        in.close();
    }
}
