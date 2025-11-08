package Arrays;

import java.util.*;

public class temp {
    public static void main(String[] args) {
        int[] arr={2,6,4,1};
        int first=0;
        int secound=0;
        Queue<Integer> q=new PriorityQueue<>(); //Collections.reverseOrder()
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int temp=arr[i]+arr[j];
//                System.out.print(temp+" ");
                if (temp%2==0){
                    if (first<temp){
                        secound=first;
                        first=temp;
                    }
//                    q.add(temp);
//                    if (q.size()>2){
//                        q.poll();
//                    }
                }
            }
        }
        System.out.println(secound);
//        System.out.println(q);
//        System.out.println(q.peek());
//        System.out.println();
    }
}
