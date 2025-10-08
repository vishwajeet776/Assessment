package Arrays;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        boolean[] ans=new boolean[candies.length];
        int extra=3;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < candies.length; i++) {
            int currSum=0;
            currSum=candies[i]+3;
            if (currSum>max){
                ans[i]=true;
                max=currSum;
            }else {
                ans[i]=false;
                max=currSum;
            }
        }
        for (boolean i:ans){
            System.out.println(i);
        }
    }
}
