import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        System.out.println("Please enter a number: ");
        Scanner scannerObj = new Scanner(System.in);
        int num = scannerObj.nextInt();

        boolean isPrime = true;

        if(num <= 1){
            System.out.println("The number is neither prime nor composite.");
        }
        else{
            for(int i = 2; i <= num/2; i++){
                if(num % i == 0){
                    //Composite
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                System.out.println("The number is prime.");
            }
            else{
                System.out.println("The number is not prime.");
            }


        }
    }
}
