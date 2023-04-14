import java.util.Arrays;

public class sum3 {
    public static void main(String[] args){
        System.out.println(extracted());
    }

    private static boolean extracted() {
        int[] nums = {3, 7, 1, 2, 8, 4, 5};
        int target = 21;

        nums = Arrays.stream(nums).sorted().toArray();
        int high = nums.length - 1;
        int low = 0;
        for (int i = low + 1; i < high; i++ ) {
            while (nums[high] + nums[low] + nums[i] < target) {
                System.out.println( "low " + nums[low] + " " + nums[i] + " " + nums[high]);
                if (low + 1 == i){
                    break;
                } else {
                    low++;
                }
            }
            while (nums[high] + nums[low] + nums[i] > target ) {
                System.out.println( "high " + nums[low] + " " + nums[i] + " " + nums[high]);
                if (high - 1 == i){
                    break;
                } else {
                    high--;
                }
            }
            if (nums[high] + nums[low] + nums[i] == target) {
                System.out.println( nums[low] + " " + nums[i] + " " + nums[high]);
                return true;
            }
        }
        return false;
    }
}
