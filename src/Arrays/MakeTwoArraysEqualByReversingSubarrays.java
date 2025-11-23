package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MakeTwoArraysEqualByReversingSubarrays {
    public static void reverse(int[] arr,int l,int r){
        while (l<r){
            int temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
    }
    public static void main(String[] args) {
        int[] target = {1, 2, 3, 4}, arr = {2, 4, 1, 9};

        boolean ans=true;
//        Set<Integer> set=new HashSet<>();
//        for(int i:target){
//            set.add(i);
//        }
//        for (int j:arr){
//            if (!set.contains(j)){
//                ans=false;
//            }
//        }
//        System.out.println(ans);
        Map<Integer,Integer> map=new HashMap<>();
        Map<Integer,Integer> map1=new HashMap<>();
        for(int i:target){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        for (int j:arr){
            if (map.containsKey(j)){
                map1.put(j, map.getOrDefault(j,0)+1);
            } else {
                ans=false;
            }
        }

        
    }
}
