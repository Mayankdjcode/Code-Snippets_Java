// While loop
// Java User Input (Scanner Class)

import java.util.Scanner;

public class _21_While {

    public static void main(String[] args) {


        //single line comment
        //multiple line comment
        // --
        /* */
      /*  int a=10;
        while (a>0)
        {
            System.out.println("a value = "+a);
            a--;
        }*/


   /*     int i=2;
        Scanner sc =new Scanner(System.in);
        int input = sc.nextInt();
        while (i<=input)
        {
            System.out.println(i);
           // i=i+2;
            i+=2;
        }*/

        int sum=0;
        //int number=500;
        int i=1;

        while (i<=500)
        {
           sum+=i;
           i++;
        }

        System.out.println(sum);

    }
}