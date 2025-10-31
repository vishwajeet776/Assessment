package Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={0, -1, 2, -3, 1};
        int target=-2;

        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<arr.length;i++){
            int num=arr[i]-target;
            if (map.containsKey(num)){
                System.out.println(map.get(num)+" "+arr[i]);
            }
            map.put(arr[i],i);
        }
    }
}
