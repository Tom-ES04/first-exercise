import java.util.Scanner;
public class SecretNumber {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        int secretNumber = 34;

        System.out.print("Guess the secret number between 1 and 50: ");
        int x = tom.nextInt();

        while (x!= secretNumber) {
            if (x<1 || x>50) {
                System.out.println("Out of bounds! Please try again.");
            }
            else if (x < secretNumber) {
                System.out.println("Less than the secret number!");
            } else {
                System.out.println("Greater than the secret number!");
            }
            System.out.print("Try again: ");
            x = tom.nextInt(); 
        }
        System.out.println("Congratulations! You've guessed the secret number.");
        tom.close();
    }
    
}

