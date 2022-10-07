package algorithms.strings;

public class HackerRankInString {
    // Solution
    public static String hackerrankInString(String s) {

        String target = "hackerrank";
        int pointer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (pointer < target.length() && s.charAt(i) == target.charAt(pointer)) {
                pointer++;
            }
        }
        if(pointer == target.length()){
            return "YES";
        } else return "NO";

    }
}
