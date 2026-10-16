import java.util.Scanner;

/**
 * 26. Kunal is allowed to go out with his friends only on the even days of a given month.
 * Write a program to count the number of days he can go out in the month of August.
 */
public class KunalAugustDays {
    public static void main(String[] args) {
        int augustDays = 31;
        int count = 0;

        System.out.println("Even days in August:");
        for (int day = 1; day <= augustDays; day++) {
            if (day % 2 == 0) {
                System.out.print(day + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total number of days Kunal can go out in August: " + count);
    }
}
