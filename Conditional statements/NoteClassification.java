
import java.util.Scanner;

public class NoteClassification {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        System.out.print("Enter your note: ");
        int x = tom.nextInt();


        if (x < 0 || x > 10) {
            System.err.println("Invalid Note");
        } else if (x >= 9 && x <= 10) {
            System.out.println("Outstanding");
        } else if (x >= 7 && x < 9) {
            System.out.println("Notable");
        } else if (x >= 5 && x < 7) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        tom.close();
    }
}
