import java.util.Scanner;
public class Answer_2_2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the type of equation to solve (1 for linear equation, 2 for linear system):");
        int equationType = scanner.nextInt();
        if (equationType == 1) {
            System.out.println("Enter the value of a:");
            double a = scanner.nextDouble();
            System.out.println("Enter the value of b:");
            double b = scanner.nextDouble();
            if (a == 0) {
                System.out.println("Error: division by zero");
            } else {
                double x = -b / a;
                System.out.println("The solution is x = " + x);
            }
        } else if (equationType == 2) {
            System.out.println("Enter the value of a1:");
            double a1 = scanner.nextDouble();
            System.out.println("Enter the value of a2:");
            double a2 = scanner.nextDouble();
            System.out.println("Enter the value of b1:");
            double b1 = scanner.nextDouble();
            System.out.println("Enter the value of b2:");
            double b2 = scanner.nextDouble();
            double det = a1 * b2 - a2 * b1;
            if (det == 0) {
                System.out.println("Error: division by zero");
            } else {
                double x = (b1 * a2 - b2 * a1) / det;
                double y = (b2 * a1 - b1 * a2) / det;
                System.out.println("The solution is x = " + x + ", y = " + y);
            }
        } else {
            System.out.println("Error: invalid equation type");
        }
        scanner.close();
    }
}