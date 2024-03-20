//primitive data types - int,long,float,double,char,boolean pass values, and not references
//What info we have in stack memeory is passed -  values

public class PassValue {
    public static void main(String[] args) {
        int a = 5,b= 10;
        swap(a,b);
        System.out.println("a = " + a + ", b = " + b);

        //a -> 5
        //b -> 10
    }
    static void swap(int c,int d){
        int temp = c;
        c = d;
        d= temp;

        //c -> 10
        //d -> 5
        //Values are passes, an changes won't affect the 
    }
    
}

