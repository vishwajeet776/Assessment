package Arrays;

public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        int total=0;
        for (int i:nums){
            total+=i;
        }

        int leftSum=0;
        int ans=0;
        for (int i = 0; i < nums.length; i++) {
            int rightSum=total-leftSum-nums[i];
            if (leftSum==rightSum){
                ans=i;
                break;
            }else{
                leftSum+=nums[i];
            }
        }
        System.out.println(ans);
    }
}
