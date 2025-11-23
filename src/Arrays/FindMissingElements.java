package Arrays;

import java.util.*;

public class FindMissingElements {
    public static void main(String[] args) {
        int[] nums = {1, 4, 2, 5};
        List<Integer> l=new ArrayList<>();
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int i:nums) {
            set.add(i);
        }
        for (int i = nums[0]; i < nums[nums.length-1] ; i++) {
            if (!set.contains(i)) {
                l.add(i);
            }
        }
        System.out.print(l);
    }
}
