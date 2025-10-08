package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr={7, 10, 4, 3, 20, 15};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for (int i:arr){
            pq.add(i);
            if (pq.size()>k){
                pq.poll();
            }
        }
        System.out.println(pq);

        int n= arr.length;

        for (int i = 0; i < k; i++) {
           int min=i;
            for (int j = i+1; j <n ; j++) {
                if (arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println(arr[k-1]);
        Arrays.stream(arr).sorted().limit(3).skip(2);
    }
}
