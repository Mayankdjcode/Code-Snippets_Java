// To find the Even and  Odd numbers till given number
import java.util.Scanner;

public class _23_givenEvenOdd {

    public static void main(String[] args) {

        //int i=10; // Initialization
        
        System.out.println("Enter a number ! "); 
        // Custom User Input
        Scanner sc=new Scanner(System.in);
        int i = sc.nextInt();
        sc.close();
        for (int j = 0; j <=i; j++) {

            if(j%2==0)
                System.out.println("even "+j);
            else
                System.out.println("odd "+j);
        }
    }
}