import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the height of the triangle: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // move to the next line
            System.out.println();
        }

        scanner.close();
    }
}
