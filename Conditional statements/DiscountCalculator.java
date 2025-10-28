
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double price = tom.nextDouble();
        System.out.print("ClientType: ");
        int ClientType = tom.nextInt();
        double discount = 0.0;

        if (price>0) {
            if (ClientType == 1) {
                discount = 0.10;
                System.out.print("The fianl price after discount is: " + (price - (price * discount)));
            } else if (ClientType == 2) {
                discount = 0.20;
                System.out.print("The fianl price after discount is: " + (price - (price * discount)));
            } else if (ClientType == 3) {
                discount = 0.30;
                System.out.print("The fianl price after discount is: " + (price - (price * discount)));
            } else {
                System.out.print("Invalid Client");


            }
        }else {
            System.out.print("Invalid Price");
        }
        tom.close();
    }
}
