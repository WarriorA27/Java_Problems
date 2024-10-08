/**
 * backtracking
 */
public class backtracking {

    public static void permutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);

            String newstr = str.substring(0, i) + str.substring(i + 1);
            // recursive call
            permutation(newstr, ans + curr);
        }

    }

    public static void main(String[] args) {
        String str = "abc";
        permutation(str, "");
    }
}