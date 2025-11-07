import java.util.Scanner;
public class LoopExercise1 {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = tom.nextInt();

        while (x!= 0) {
            if (x%2 == 0) {
                System.out.println(x + " is even.");
            } else {
                System.out.println(x + " is odd.");
            }
            System.out.print("Enter a number: ");
            x = tom.nextInt();

        }System.out.println("Program ended!");
    }
} 
