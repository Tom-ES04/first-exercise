import java.util.Scanner;
public class LoopExercise2 {
    public static void main(String[] args) {
        Scanner tom = new Scanner(System.in);
        int x;
        
        System.out.print("Enter a number: ");
        x = tom.nextInt();
        int count = 0; 

        while (x>0) {
            if (x>10) 
            count++;
            System.out.print("Enter another number: ");
            x = tom.nextInt();
        }System.out.println("Total numbers greater than 10: " + count);
        System.out.println("Program ended!");
        
    }
    
}
