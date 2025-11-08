package Arrays;

public class FindTheMiddleIndexInArray {
    public static void main(String[] args) {
        int[] nums = {2,3,-1,8,4};
        int totalSum =0;
        for (int i = 0; i < nums.length; i++) {
            totalSum +=nums[i];
        }
        System.out.println(totalSum);
        int leftSum=0;
        int right=totalSum;
        for (int i = 0; i < nums.length-1; i++) {
            if (leftSum==right){
                System.out.println(i);
                
            }
            leftSum+=nums[i];
            if (i+1 < nums.length){
                right-=nums[i+1];
            }else {
                right=0;
            }
        }
    }
}
