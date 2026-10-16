import java.util.Scanner;

/**
 * 22. Java Program Vowel Or Consonant
 */
public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an alphabet character: ");
        char ch = in.next().charAt(0);

        if (Character.isLetter(ch)) {
            char lower = Character.toLowerCase(ch);
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                System.out.println(ch + " is a VOWEL.");
            } else {
                System.out.println(ch + " is a CONSONANT.");
            }
        } else {
            System.out.println(ch + " is not an alphabet letter.");
        }
        in.close();
    }
}
