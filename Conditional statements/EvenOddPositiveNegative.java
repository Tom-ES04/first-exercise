
import java.util.Scanner;

public class EvenOddPositiveNegative {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = tom.nextInt();


        if (x == 0) {
            System.out.println("None positive/negative");
        }else if (x >0) {
            System.out.println("Positive ");
        }else {
            System.out.println("Negative ");
        }

        if (x % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        tom.close();
            
        
    }
}
