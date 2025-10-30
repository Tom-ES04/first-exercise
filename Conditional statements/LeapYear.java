import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int x = tom.nextInt();


        if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0)) {
            System.out.println(x + " is a leap year.");
        } else {
            System.out.println(x + " is not a leap year.");
        }
        tom.close();
        
    }
}
