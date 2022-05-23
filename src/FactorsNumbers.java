import java.util.Scanner;

public class FactorsNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number here : ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                System.out.print(i + " ");
            }
        }

    }
}
