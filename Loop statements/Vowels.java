
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        int VowelCount = 0;


        while (ch!= '.') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                VowelCount++;
            }
            System.out.print("Enter another character: ");
            ch = scanner.next().charAt(0);
        }
        System.out.println("Total number of vowels entered: " + VowelCount);
        scanner.close();


    }
}
