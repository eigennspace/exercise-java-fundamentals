import java.util.Scanner;

public class TrianglePascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi :");
        int n = scanner.nextInt();
        segitigaPascal(n);
        }

       public static void segitigaPascal(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 0; j <= n-i; j++) {
                    System.out.print(" ");
                }
                    int c = 1;
                    for (int k = 1; k <= i; k++) {
                        System.out.print(c + " ");
                        c = c * (i - k)/k;
                    }
                System.out.println();
                }
            }
        }