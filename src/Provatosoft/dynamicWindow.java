package Provatosoft;

public class dynamicWindow {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 0, 1, 1, 0};
        int k = 4;

        int start = 0, sum = 0, maxLen = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];  // expand the window

            while (sum > k) {
                sum -= arr[start];
                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        System.out.println( maxLen);
    }
}
