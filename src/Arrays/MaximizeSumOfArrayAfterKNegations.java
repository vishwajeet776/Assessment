package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {

    public static int largestSumAfterKNegations(int[] nums, int k) {
        int maxSum=0;
        int count=1;
        while (count<=k){
            Arrays.sort(nums);
            nums[0]-=nums[0]*2;
            count++;
        }
        for (int i:nums){
            maxSum+=i;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {5,6,9,-3,3} ;
        int k = 2;
        System.out.println(largestSumAfterKNegations(nums,k));
//        int count=1;
//        int maxSum=0;
//        while (count<=k){
//            Arrays.sort(nums);
//            nums[0]-=nums[0]*2;
//            count++;
//            System.out.println();
//        }
//        for (int i = 0; i < nums.length; i++) {
//            maxSum+=nums[i];
//        }
//        System.out.println(maxSum);
    }
}
