import java.util.Scanner;
public class VotingAge {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        System.out.print("Enter first age: ");
        int x = tom.nextInt();

        if (x < 0) {
            System.out.println("Age cannot be negative.");
        }else if (x < 18) {
            System.out.println("Not eligible to vote.");
        } else {
            System.out.println("Eligible to vote.");
        }
    }
    
}
