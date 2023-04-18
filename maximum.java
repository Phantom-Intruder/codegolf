import java.util.ArrayList;

public class maximum {

    public static void main(String[] args){
        extracted();
    }

    public static void extracted() {
        // your code will replace the placeholder return statement below
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int w = 3;
        ArrayList<Integer> ar = new ArrayList<>();
        for (int i=0; i <= nums.length; i++){
            int max = Integer.MIN_VALUE;
            for (int j=i; w+j < nums.length; j++) {
                System.out.println(nums[j]);
                if (nums[j] > max) {
                    max = nums[j];
                }
            }
            ar.add(max);
        }
        System.out.println(ar);
    }
}
