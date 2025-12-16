package Arrays;

import java.util.Arrays;

public class Concatenation {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,1};
        System.out.println(Arrays.toString(concatenation(nums)));
    }
    public static int[] concatenation(int[] nums){
        int len = nums.length;
        int[] ans = new int[2*len];
        for (int i = 0; i < len; i++) {
            ans[i] = nums[i];
            ans[i + len] = nums[i];
        }
        return ans;
    }
}
