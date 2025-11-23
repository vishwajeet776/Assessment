package Arrays;

import java.util.HashMap;
import java.util.Map;

public class LongestHarmoniousSubsequence {
    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int max=0;
        for (int i: map.keySet()){
            if (map.containsKey(i+1)){
                int len=map.get(i)+ map.get(i+1);
                max=Math.max(max,len);
            }
        }
        System.out.println(max);
    }
}
