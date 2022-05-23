import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        String words;
        int countVowel = 0;
        int countConsonant = 0;
        int countSpecialChar = 0;
        int countDigit = 0;
        int countWhiteSpace = 0;

        System.out.println("------------------------------------");
        System.out.println("**Count Your Lovely Words Here**");
        System.out.println("------------------------------------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your words : ");
        words = scanner.nextLine();
        words = words.toLowerCase();

        int length = words.length();

        for (int i = 0; i < length; i++) {
            char alphabet = words.charAt(i);

            if (alphabet == 'a' || alphabet == 'i' || alphabet == 'u' || alphabet == 'e' || alphabet == 'o' ){
               countVowel ++;
            } else if (alphabet >= 'a' && alphabet <= 'z'){
                 countConsonant ++;
            } else if (alphabet > '0' && alphabet < '9') {
                countDigit ++;
            } else if (alphabet == ' ') {
                countWhiteSpace ++;
            } else {
                countSpecialChar ++;
            }
        }
        System.out.println("Total Words in your input = " + length);
        System.out.println("The details in your words : ");
        System.out.println("Vowel in your words = " + countVowel);
        System.out.println("Consonant in your words = " + countConsonant);
        System.out.println("Digit in your words = " + countDigit);
        System.out.println("White Space in your words = " + countWhiteSpace);
        System.out.println("Special Char = " + countSpecialChar);

        scanner.close();
    }
}