package Arrays;

public class FindTheMiddleIndexInArray {
    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        int total=0;
        for (int i:nums){
            total+=i;
        }
        int left=0;
        for (int i = 0; i < nums.length; i++) {
            int right=total-left-nums[i];
            if (left==right){
                System.out.println(i);
            }else {
                left+=nums[i];
            }
        }
    }
}
