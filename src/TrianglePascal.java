import java.util.Scanner;

public class TrianglePascal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi :");
        int n = scanner.nextInt();
        segitigaPascal(n);
        }

       public static void segitigaPascal(int n){
            for (int line = 1; line <= n; line++) {
                for (int j = 0; j <= n - line; j++) {
                    System.out.print(" ");
                }
                    int c = 1;
                    for (int k = 1; k <= line; k++) {
                        System.out.print(c + " ");
                        c = c * (line - k)/k;
                    }
                System.out.println();
                }
            }
        }