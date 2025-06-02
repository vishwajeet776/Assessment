package Provatosoft;

import java.util.Arrays;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr={8, 2, 4, 5, 3, 7, 1};
        int n= arr.length+1;
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.println(sum);
        int exSum=n*(n+1)/2;
        System.out.println(exSum);
        int ans=exSum-sum;
        System.out.println(ans);
    }
}
