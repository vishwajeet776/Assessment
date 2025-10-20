package Window;

public class MaximumSumOfASubarrayWithKElements {
    public static void main(String[] args) {
        int[] arr = {5, 2, -1, 0, 3};
        int k = 3;
        int maxSum=0;
        for (int i = 0; i < k; i++) {
            maxSum+=arr[i];
        }
        int windowSum=maxSum;
        for (int i = k; i < arr.length; i++) {
            windowSum+=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        System.out.println(maxSum);
    }
}
