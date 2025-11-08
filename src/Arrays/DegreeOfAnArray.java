package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DegreeOfAnArray {
    public static void main(String[] args) {
        int[] nums={1,2,2,3,1,4,2};

//        find frequency
        int frequency=0;
        int target=0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
            frequency=Math.max(frequency,map.get(i));
        }
        System.out.println(frequency);
        System.out.println(map);


//        for (Map.Entry<Integer,Integer> entry: map.entrySet()){
//            if (frequency< entry.getValue()){
//                frequency= entry.getValue();
//                target= entry.getKey();
//            }
//        }
//        System.out.println(target+" "+frequency);

//        find target
        int right=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==target){
                right=i;
                break;
            }
        }
        System.out.println(right);

        int end= 0;
        for (int i = nums.length-1; i >=0 ; i--) {
            if (nums[i]==target){
                end=i;
                break;
            }
        }

        System.out.println(end-right);

//        subArray
        int count=0;

        List<Integer> list=new ArrayList<>();
        while (count<=frequency && right< nums.length){
            list.add(nums[right]);
            if (nums[right]==target){
                count++;
            }
            right++;
        }
//        System.out.println(right+1);
    }
}
