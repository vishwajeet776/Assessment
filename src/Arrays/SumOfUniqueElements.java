package Arrays;

import java.util.*;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        int sum=0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:nums){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for (int i: map.keySet()){
            if (map.get(i)==1){
                sum+= map.get(i);
            }
        }
        System.out.println(sum);
    }
}
