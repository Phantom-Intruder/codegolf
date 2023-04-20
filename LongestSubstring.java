import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args){
        System.out.println(findLongestSubstring("abcdbea"));
    }

    public static int findLongestSubstring(String inputString) {
        HashMap<Character, Integer> h = new HashMap<>();
        char[] in = inputString.toCharArray();
        int max = 0;
        int left = 0;
        int right = 0;

        for (char c : in) {
            System.out.println(c);
            System.out.println(max);
            if (h.containsKey(c)) {
                max = Math.max(right - left, max);
                while (in[left] != c) {
                    System.out.println("lef in: " + in[left] + " : char: " + c);
                    h.remove(in[left]);
                    left++;
                }
                left++;
                h.put(c, 1);
            } else {
                h.put(c, 1);
            }
            right++;
        }

        return Math.max(right - left, max);
    }
}
