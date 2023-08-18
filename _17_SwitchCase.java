// Simple Switch-Case Statement program to print Roman Numerals for corresponding numbers entered as input .  
// Switch statements are decision making statements under control flow statements .

import java.util.Scanner;

public class _17_SwitchCase {
    public static void main(String[] args) {

        //int x=6; (initialization)

        //taking input from user
        Scanner scanner = new Scanner(System.in);
        String result = null;
        int x = scanner.nextInt();
        if (x > 10)
            System.out.println("Invalid Input");
        else {
            switch (x) {
                case 1:
                    result = "I";
                    break;
                case 2:
                    result = "II";
                    break;
                case 3:
                    result = "III";
                    break;
                case 4:
                    result = "IV";
                    break;
                case 5:
                    result = "V";
                    break;
                case 6:
                    result = "VI";
                    break;
                case 7:
                    result = "VII";
                    break;
                case 8:
                    result = "VIII";
                    break;
                case 9:
                    result = "IX";
                    break;
                case 10:
                    result = "X";
                    break;
                default:
                    result = "invalid Input";
            }

            System.out.println("Your result for Input = " + x + " is = " + result);
        }
    }
}