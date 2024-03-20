//Note: function parameter: String... args and not String[] args
//Function argument is passed as "a","b,"c" and not {"a","b","c"}
import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        varArgs(1,2,"a", "b", "c");
    }

    static void varArgs(int a, int b, String... args) {
        System.out.println(Arrays.toString(args));
    }
}
