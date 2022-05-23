import java.util.Scanner;

public class Palindrome {
        public static void main(String args[])
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string/number : ");
            String original = scanner.nextLine();
            original = original.toLowerCase();

            int length = original.length();

            String reverse = "";

            for ( int i = length - 1; i >= 0; i-- ) {
                reverse = reverse + original.charAt(i);
            }
            if (original.equals(reverse))
                System.out.println("Reversed : " + reverse + " is a Palindrome.");
            else
                System.out.println("Reversed : " + reverse + " is Not a Palindrome.");
        }
    }