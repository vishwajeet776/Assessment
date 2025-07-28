package Provatosoft;

public class SlidingWindow extends RuntimeException {

    public static int temp1(int a){
        return a;
    }
    public static void main(String[] args) {
//        maximum sum of a subarray
//        of size k
        int[] arr={1,5,7,2,3,4,6};
        int k=3;
        int n= arr.length-1;

        int maxSum=0;
        int windowSum=0;

        for (int i = 0; i < k; i++) {
            windowSum+=arr[i];
        }

        for (int i = k; i<n ; i++) {
            windowSum+=arr[k]-arr[i-k];
            maxSum=Math.max(windowSum,maxSum);
        }

        System.out.println(maxSum);


    }
}
