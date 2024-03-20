//Is it an armstrong number ?

import java.util.Scanner;

public class Armstrong{
    public static void main(String[] args) {
        System.out.print("Enter the number:");
        int num;
        try(Scanner input = new Scanner(System.in)){
            num = input.nextInt();
        }
        boolean flag = isArmstrong(num);
         System.out.println(flag ? "The number is an armstrong." : "The number is NOT an armstrong.");
    }

    static boolean isArmstrong (int num){
        int temp = 0, num2 = num;
         while( num > 0 ){
            int digit = num % 10;
            temp += Math.pow(digit, 3);
            
            num = num /10;
         }
         return num2 == temp;
    }
}