package algorithms.strings;

public class MarsExploration {

    // Solution
    public static int marsExploration(String s) {
        int numOfMessages = s.length()/3;
        int count = 0;
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < numOfMessages; i++) {
            buffer.append("SOS");
        }
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != buffer.charAt(i)){
                count++;
            }
        }
        return count;
    }
}
