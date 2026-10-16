import java.util.Scanner;

/**
 * 19. Curved Surface Area Of Cylinder
 * Formula: CSA = 2 * PI * radius * height
 */
public class CurvedSurfaceAreaOfCylinder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius of cylinder: ");
        double radius = in.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double height = in.nextDouble();

        double csa = 2 * Math.PI * radius * height;
        System.out.printf("Curved Surface Area of Cylinder: %.4f%n", csa);
        in.close();
    }
}
