package Arrays;

import java.util.Arrays;

public class MonotonicArray {
    public static boolean Monotonic(int[] arr){
        boolean isAssending=true;
        boolean isDesendsing=true;
        for (int i=1;i< arr.length;i++){
            if (arr[i-1]<=arr[i]){
                isDesendsing=false;
            }
            if (arr[i-1]>=arr[i]){

                isAssending=false;
            }

        }
        return false;
    }
    public static void main(String[] args) {
       int[] nums = {1,2,2,3};
       int prev=0;
       int current=0+1;
       int next=0+2;

    }
}
