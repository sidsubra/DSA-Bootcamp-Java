//non-primitive data types - Objects,Strings,Arrays etc
//What info we have in stack memeory is passed - reference to the data in heap memory 

public class PassValueOfReference1 {
    public static void main(String[] args) {
        String a = "hi",b= "hello";
        swap(a,b);
        System.out.println("a = " + a + ", b = " + b);
    }
    static void swap(String c,String d){
        //Pass Value of Reference (Copy of reference)
        //Before swap
        // a -> "hi" <- c 
        // b -> "hello" <- d


        //If it had been pass by reference, then
        //  a,c -> "hi"
        //  b,d -> "hello"


        String temp = c;
        c = d;
        d= temp;

        //After swap
        //a -> "hi" <- d
        //b -> "hello" <- c


    }
}
