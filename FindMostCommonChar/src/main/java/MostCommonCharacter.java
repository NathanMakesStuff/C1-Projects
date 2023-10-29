import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap map = new HashMap<>();
        Integer times = 0;
        int highest = 0;
        char highestChar = 0;
        for (int i = 0; i < str.length(); i++) {
            times = 0;
            map.putIfAbsent(str.charAt(i), times);
            times = (Integer) map.get(str.charAt(i));
            map.replace(str.charAt(i), times+1);
            if((int) map.get(str.charAt(i)) > highest) {
                highest = (int) map.get(str.charAt(i));
                highestChar = str.charAt(i);
            }
        }

        
        return highestChar;
    }
}
