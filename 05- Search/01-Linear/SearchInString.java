//Linear search - unsorted array
// Search for a character in  a string 
//Note: str.toCharArray()
//Note: str.charAt(i)

public class SearchInString {
    public static void main(String[] args) {
        // ommited for simplicity
    }


    static boolean search2(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for(char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}
