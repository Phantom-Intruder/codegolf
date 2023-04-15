public class palindrome2 {
    public static void main(String[] args){
        System.out.println(extracted());
    }

    private static boolean extracted() {
        String s = "dead";

        int left = 0;
        int right = s.length() - 1;
        int skip = 0;

        while (left <= right){
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else if (skip == 1) {
                return false;
            } else {
                skip++;
                if (s.charAt(left + 1) == s.charAt(right)) {
                    left++;
                } else if (s.charAt(right - 1) == s.charAt(left)){
                    right--;
                }
            }
        }
        return true;
    }
}
