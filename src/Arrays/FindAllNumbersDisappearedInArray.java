package Arrays;

import java.util.*;

public class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> list=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        int start=arr[0];
        int end=arr[n-1];
        System.out.println(start+" "+end);
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i <n; i++) {
            set.add(arr[i]);
        }
        for (int i = 1; i <= end; i++) {
            if (!set.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
