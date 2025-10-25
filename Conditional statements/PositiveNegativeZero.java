
import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = tom.nextInt();

        if (x==0){
            System.out.print("The number is zero.");
        }else if (x>0) {
            System.out.print("The number is positive.");
        } else {
            System.out.print("The number is negative.");
        }

        tom.close();
    }
}
