package Provatosoft;

public class SlidingWindow {
    public static void main(String[] args) {
//        maximum sum of a subarray
//        of size k
        int[] arr={1,5,7,2,3,4,6};
        int n= arr.length;
        int k=3; //size of the window
        int Window_sum=0;
        int maxSum=0;
        for (int i = 0; i < k; i++) {
            Window_sum+=arr[i];
        }
        for (int i = k; i < n ; i++) {
            Window_sum+=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,Window_sum);
        }
        System.out.println(maxSum);
    }
}
