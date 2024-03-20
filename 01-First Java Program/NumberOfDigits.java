import java.util.Scanner;

public class NumberOfDigits{
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        try(Scanner ip = new Scanner(System.in)){
            int num = ip.nextInt();
            //Note Trick
            int number_of_digits = (int) Math.log10(num) + 1;
            System.out.println("Number of digits:" + number_of_digits);
        }
    }
}