import java.util.Scanner;

/**
 * 17. Volume Of Sphere
 * Formula: Volume = (4/3) * PI * radius^3
 */
public class VolumeOfSphere {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of sphere: ");
        double radius = in.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.printf("Volume of Sphere: %.4f%n", volume);
        in.close();
    }
}
