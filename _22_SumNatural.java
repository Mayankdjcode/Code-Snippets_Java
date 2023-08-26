// Sum of Natural numbers using for loop

import java.util.Scanner;

public class _22_SumNatural {

    public static void main(String[] args) {


        // To find sum of natural numbers from 1 to 897;
        //int number=897;
        int sum=0;
        // To find Sum of natural numbers from 1 to given user input number
        System.out.println("Enter a number ! ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for (int i = 1; i <=number ; i++) {
                sum+=i;
        }
        System.out.println("Sum of natural number till "+number+" = "+sum);
    }
}