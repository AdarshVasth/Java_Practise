import java.util.Scanner;

/**
 * 24. Check Leap Year Or Not
 * A year is a leap year if:
 * (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = in.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap) {
            System.out.println(year + " is a LEAP YEAR.");
        } else {
            System.out.println(year + " is NOT a leap year.");
        }
        in.close();
    }
}
