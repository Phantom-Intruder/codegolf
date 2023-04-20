public class MinSizeSliding {
    public static void main(String[] args){
        System.out.println(minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }

    public static int minSubArrayLen(int target, int[] arr) {
        int left = 0;
        int t = 0;
        int r = Integer.MAX_VALUE;
        for (int right = 0; right < arr.length; right++){
            int rightV = arr[right];
            t += rightV;
            while (t >= target){
                r = Math.min(r, right - left + 1);
                t -= arr[left];
                left++;
            }
        }
        r = r == Integer.MAX_VALUE ? 0 : r;
        return r;
    }
}
