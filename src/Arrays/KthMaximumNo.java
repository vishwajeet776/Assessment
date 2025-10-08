package Arrays;

import Provatosoft.TreeMapIterate;

import java.util.TreeSet;

public class KthMaximumNo {
    public static void main(String[] args) {
        int[] nums = {2,2,3,1};

        TreeSet<Integer> set=new TreeSet<>();

        for (int i:nums){
            set.add(i);
            if (set.size() > 3) {
                set.pollFirst(); // remove smallest element to keep only top 3
            }
        }
        if (set.size()==3){
            System.out.println(set.first());
        }else {
            System.out.println(set.last());
        }

        System.out.println(".........");
        System.out.println(set.last());

        for (int i = 0; i < 3; i++) {
            for (int j = 1; j < nums.length-i; j++) {
                if (nums[j-1]>nums[j]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        System.out.print(nums[nums.length-3]+"  ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(" ,"+nums[i]);
        }
    }
}
