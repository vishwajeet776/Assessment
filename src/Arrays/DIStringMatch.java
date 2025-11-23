package Arrays;

public class DIStringMatch {
    public static void main(String[] args) {
        String s = "IDID";
        int n=s.length();
        System.out.println(n);
        int[] nums=new int[n+1];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=i;
        }
        for (int i:nums){
            System.out.print(i+" ");
        }
        System.out.println();
        int[] ans=new int[nums.length];
        int l=0;
        int r= nums.length-1;
        while(l<=r){
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)=='I'){
                    ans[i]=nums[l];
                    l++;
                }else {
                    ans[i]=nums[r];
                    r--;
                }
            }
        }
        for (int i:ans){
            System.out.print(i+" ");
        }
    }
}
