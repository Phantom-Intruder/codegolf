import java.util.HashMap;

public class Solution {
    public static void main(String[] args){
        String str = "abbcb";
        int k = 1;
        int windowStart = 0;
        int maxRepeat = 0;
        HashMap<Character, Integer> repeatMap = new HashMap<>();
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++){
            char rightChar = str.charAt(windowEnd);
            repeatMap.put(rightChar, repeatMap.getOrDefault(rightChar, 0) + 1);
            System.out.println(repeatMap.size());
            while (repeatMap.size() > k){
                char leftChar = str.charAt(windowStart);
                repeatMap.put(leftChar, repeatMap.getOrDefault(leftChar, 0) - 1);
                if (repeatMap.get(leftChar) == 0){
                    repeatMap.remove(leftChar);
                }
                windowStart++;
            }
            maxRepeat = Math.max(maxRepeat, windowEnd - windowStart + 1);
        }
        System.out.println(maxRepeat);
    }
}
