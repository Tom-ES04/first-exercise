
import java.util.Scanner;

public class NewCalculator {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        System.out.println("Enter calculation: ");
        double a = tom.nextDouble();
        char op = tom.next().charAt(0);
        double b = tom.nextDouble();
        double result = 0;

        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Error: Invalid operator!");
                return;
        }

        System.out.println("Result: " + result);
    }
}
