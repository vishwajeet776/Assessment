package Arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    public static void main(String[] args) {
        int[] stones = {3,1,2,5,4,6,7};
        int x=0;
        int y=stones[0];
        Queue<Integer> queue=new PriorityQueue<>();
        for (int i = 0; i < stones.length; i++) {
            queue.add(stones[i]);
            if (queue.size()>2){
                queue.poll(); //Retrieves and removes the head of this queue or returns null if this queue is empty.
            }
        }
//        System.out.println(x+" "+y);
        System.out.println(queue);
    }
}
