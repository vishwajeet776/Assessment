package Arrays;

public class SmallestIndexWithDigitSumEqualToIndex {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        for (int i = 0; i < nums.length; i++) {
            int a=nums[i];
            int sum=0;
            while (a>0){
                int temp=a%10;
                sum+=temp;
                a=a/10;
            }
            if (sum==i){
                System.out.println(i);
                break;
            }
        }
    }
}
