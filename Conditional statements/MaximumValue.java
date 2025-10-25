
import java.util.Scanner;

public class MaximumValue {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = tom.nextInt();
        System.out.print("Enter second number: ");
        int b = tom.nextInt();
        System.out.print("Enter third number: ");
        int c = tom.nextInt();

        int max = a;

        if (b > max) max = b;
        else if (c > max) max = c;

        System.out.println("The maximum value is: " + max);
        System.out.print("Variables with the maximum value: ");

        boolean first = true;
        if (a == max) {
            System.out.print("a");
            first = false;
        }if (b == max) {
            if (!first) System.out.print(", ");
            System.out.print("b");
            first = false;
        }if (c == max) {
            if (!first) System.out.print(", ");
            System.out.print("c");
        }
        tom.close();
        


    }
    
}
