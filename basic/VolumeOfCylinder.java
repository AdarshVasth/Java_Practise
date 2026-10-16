import java.util.Scanner;

/**
 * 16. Volume Of Cylinder
 * Formula: Volume = PI * radius^2 * height
 */
public class VolumeOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        double radius = in.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double height = in.nextDouble();

        double volume = Math.PI * radius * radius * height;
        System.out.printf("Volume of Cylinder: %.4f%n", volume);
        in.close();
    }
}
