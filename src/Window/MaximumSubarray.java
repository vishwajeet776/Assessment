package Window;

public class MaximumSubarray {
    public static void main(String[] args) {
       int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
       int maxSum=0;
        for (int right = 0; right < nums.length; right++) {
            int curSum=0;
            curSum+=nums[right];
            if (curSum>maxSum){
                maxSum=curSum;
            }
        }
        System.out.println(maxSum);
    }
}
