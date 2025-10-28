import java.util.Scanner;
public class NumberInRange {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        System.out.print("Enter a number: ");

        int n = tom.nextInt();

        if (n<10 || n>50) {
            System.out.println("Number is out of range");
        } else {
            System.out.println("Number is within range");
        }
        tom.close();
    }
}
