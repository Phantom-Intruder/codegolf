import java.util.ArrayList;
import java.util.stream.Collectors;

public class MinWindow {
    public static void main(String[] args){
        System.out.println(minWindow("afgegrwgwagb", "ab"));
    }

    public static String minWindow(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        int sP = 0;
        int tP = 0;
        ArrayList<Character> c = new ArrayList<>();
        boolean f = false;

        while (sP < s1.length && tP < t1.length){
            if (s1[sP] == t1[tP]){
                tP++;
                f = true;
            }
            if (f){
                c.add(s1[sP]);
            }
            sP++;
            System.out.println(sP);
            System.out.println(s1[sP]);
            if (sP+1 == s1.length) {
                if (s1[sP] == t1[tP]){
                    c.add(s1[sP]);
                    return c.stream().map(String::valueOf).collect(Collectors.joining());
                }
                return "";
            }
        }
        return c.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
