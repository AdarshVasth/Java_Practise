import java.util.Scanner;

/**
 * 14. Volume Of Cone Java Program
 * Formula: Volume = (1/3) * PI * radius^2 * height
 */
public class VolumeOfCone {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of cone base: ");
        double radius = in.nextDouble();
        System.out.print("Enter height of cone: ");
        double height = in.nextDouble();

        double volume = (1.0 / 3.0) * Math.PI * radius * radius * height;
        System.out.printf("Volume of Cone: %.4f%n", volume);
        in.close();
    }
}
