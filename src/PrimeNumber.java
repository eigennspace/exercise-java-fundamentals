import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Check Your Number ");
        int number = scanner.nextInt();
        boolean checkPrime = false;

        for (int i = 2; i < number/2 ; i++) {
            if (number % i == 0){
                checkPrime = true;
                break;
            }
        }

        if (!checkPrime)
            System.out.println(number + " Prime");
        else
            System.out.println(number + " isn't Prime");
    }
}
