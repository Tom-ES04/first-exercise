

import java.util.Scanner;

public class OtherDiscountCalculator {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        double price;
        int ClientType;
        System.out.print("Enter the original price: ");
        price = tom.nextDouble();
        System.out.print("Enter client type: ");
        ClientType = tom.nextInt();

        if (price > 0) {
            double discount = 0.0;
            switch (ClientType) {
                case 1:
                    discount = 0.10; 
                    break;
                case 2:
                    discount = 0.20; 
                    break;
                case 3:
                    discount = 0.30; 
                    break;
                default:
                    discount = 0.0; 
                    break;
            }
        
            System.out.printf("The final price after discount is: %.2f ", price * (1 - discount));
        }else {
            System.out.print("Invalid Price");
        }
        tom.close();
    }
}
