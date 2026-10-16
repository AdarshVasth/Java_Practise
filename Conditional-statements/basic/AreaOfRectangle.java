import java.util.Scanner;

/**
 * 3. Area Of Rectangle Program
 * Formula: Area = length * breadth
 */
public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = in.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = in.nextDouble();

        double area = length * breadth;
        System.out.printf("Area of Rectangle: %.4f%n", area);
        in.close();
    }
}
