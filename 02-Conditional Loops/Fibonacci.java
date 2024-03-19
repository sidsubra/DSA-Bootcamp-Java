import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        try (Scanner input = new Scanner(System.in)) {
            int num = input.nextInt();
            
            int a = 0, b = 1;
            System.out.print(a + "," + b);
            for(int i = 0; i < num -2 ; i++){
                int c = a + b;
                System.out.print(","+ c);
                a=b;
                b=c;
            }
        }
    }
    
}
