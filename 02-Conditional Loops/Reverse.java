//Reverse a number
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();

            int reversedNum = 0;
            while(num > 0) {
                int digit = num % 10;
                reversedNum = (reversedNum * 10) + digit;
                num = num /10;
            }
            System.out.print("The reversed number: "+ reversedNum);
        }

    }
}
