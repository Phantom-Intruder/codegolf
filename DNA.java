import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DNA {
    public static void main(String[] args){
        System.out.println(findRepeatedSequences("AAAAACCCCCAAAAACCCCCC", 8));
    }

    public static List<String> findRepeatedSequences(String s, int k) {

        char[] sc = s.toCharArray();
        HashSet<String> ar = new HashSet<>();
        HashSet<String> o = new HashSet<>();

        for (int i=0; i < sc.length - k; i++) {
            String substring = s.substring(i, i + k);
            if (ar.contains(substring)){
                o.add(substring);
            } else {
                ar.add(substring);
            }
            //System.out.println(substring);
        }

        return new ArrayList<>(o);
    }
}
