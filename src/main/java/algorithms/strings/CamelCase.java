package algorithms.strings;

public class CamelCase {

    // Solution
    public static int camelcase(String s) {
        int out = 1;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                out++;
            }
        }
        return out;
    }

}
