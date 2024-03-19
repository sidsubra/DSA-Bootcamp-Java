//This program counts the number of digits in a number

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a number:");
            int num = input.nextInt();

            int digits = 0;
            while(num > 0){
                digits++;
                num = num / 10;
            }
            System.out.println("Number of digits:" + digits);
        }
    }
}
