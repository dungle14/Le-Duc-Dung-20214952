
import java.util.Scanner;
public class Answer_2_2_5{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your first number?");
        double num1 = scanner.nextDouble();
        System.out.println("What is your second number?");
        double num2 = scanner.nextDouble();
        double sum = num1 + num2;
        double diff = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        scanner.close();
    }
    
}
