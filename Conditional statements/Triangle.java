import java.util.Scanner;
public class Triangle {
    public static void main (String [] args){
        Scanner tom = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.print("Enter first side: ");
        a = tom.nextInt();
        System.out.print("Enter second side: ");
        b = tom.nextInt();
        System.out.print("Enter third side: ");
        c = tom.nextInt();

        if (a > 0 &&  b > 0 &&  c > 0){
            if (a + b > c && a + c > b && b + c > a){
                System.out.println("The sides form a valid triangle");
                if (a == b && b == c) {
                    System.out.println("The triangle is equilateral");
                } else if (a == b || b == c || a == c) {
                    System.out.println("The triangle is isosceles");
                } else {
                    System.out.println("The triangle is scalene");
                }
            } else {
                System.out.println("The sides do not form a valid triangle");
            }
        } else {
            System.out.println("Sides must be positive integers");
        }
        
    }
}
