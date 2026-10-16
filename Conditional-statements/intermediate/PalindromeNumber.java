import java.util.Scanner;

/**
 * 18. Find if a number is palindrome or not
 * Example: 121 -> Palindrome, 123 -> Not Palindrome
 */
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = in.nextInt();

        if (n < 0) {
            System.out.println(n + " is NOT a palindrome (negative numbers are not palindromes).");
        } else {
            int original = n;
            int reversed = 0;
            while (n > 0) {
                int rem = n % 10;
                reversed = reversed * 10 + rem;
                n /= 10;
            }

            if (original == reversed) {
                System.out.println(original + " is a Palindrome Number.");
            } else {
                System.out.println(original + " is NOT a Palindrome Number.");
            }
        }
        in.close();
    }
}
