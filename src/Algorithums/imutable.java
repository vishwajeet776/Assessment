package Algorithums;


//int[] arr = {1, 2, 3, 2, 4, 5, 1};
//reverse the array using loop

import java.util.*;

public class imutable {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};

        List<Integer> list=new ArrayList<>();

        Map<Integer,Integer> map=new LinkedHashMap<>();

        int left=0;
        int right= arr.length-1;
        while (left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        for (int i:arr){
            System.out.print(i+" ,");
            list.add(i);
        }

        for (int i = arr.length-1; i >0; i++) {
            map.put(arr[i], map.getOrDefault(arr[i],0)+1 );
        }
        System.out.println(map);
//        System.out.println();
//        System.out.println(list);
    }
}
