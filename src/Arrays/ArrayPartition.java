package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        int[] nums = {1,4,3,2};
        Arrays.sort(nums);
        for (int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();
        int sum=0;
        for (int i = 0; i < nums.length; i+=2) {
                sum+=nums[i];
        }
        System.out.println(sum);

    }
}
