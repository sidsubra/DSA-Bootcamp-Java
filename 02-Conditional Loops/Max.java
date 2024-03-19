//Find max out of 3 numbers

import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers: ");
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();

            int max = Math.max(a, Math.max(b,c));
            System.out.println("Max out of 3 numbers: "+max);
        }


    }
}
