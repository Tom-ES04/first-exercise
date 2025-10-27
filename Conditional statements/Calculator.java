import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        double a;
        double b;
        System.out.print("Enter first number: ");
        a = tom.nextDouble();
        System.out.print("Enter second number: ");
        b = tom.nextDouble();
        char op;
        System.out.print("Enter an operator: ");
        op = tom.next().charAt(0);
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
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println("The result is: " + result);
    }
    
    
}
