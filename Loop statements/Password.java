
import java.util.Scanner;
public class Password {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        String password = "Trungson2004";
        System.out.print("Enter your password: ");
        String input = tom.nextLine();

        while (!input.equals(password)) {
            System.out.println("Worng password!! Try again.");
            System.out.print("Enter your password: ");
            input = tom.nextLine();
        }
        System.out.println("Correct password. Access granted.");
    }
}