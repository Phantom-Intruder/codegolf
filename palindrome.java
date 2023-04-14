public class palindrome {
    public static void main(String[] args){
        System.out.println(extracted());
    }

    private static boolean extracted() {
        String s = "kayak";

        int left = 0;
        int right = s.length() - 1;

        while (left <= right){
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
