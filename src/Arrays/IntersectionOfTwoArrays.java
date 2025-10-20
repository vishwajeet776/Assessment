package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

    public static boolean BinarySearch_ (int[] arr,int n){
        int left=0;
        int right=arr.length;
        boolean ans=false;
        while (left<right){
            int mid=left+(right-left)/2;
            if (arr[mid]==n){
                return ans=true;
            } else if (arr[mid]>=n) {
                right=mid;
            }else {
                left=mid;
            }
        }
        return false;
    }

    public static void main(String[] args) {
       int [] nums1 = {4,9,5}, nums2 = {9,4,9,8,4};
        Set<Integer> set=new HashSet<>();
        for (int i:nums2){
            set.add(i);
        }
        for (int i = 0; i < nums1.length; i++) {
//            if (BinarySearch_(nums2,nums1[i])){
//                System.out.print(nums1[i]+" ");
//            }
            if (set.contains(nums1[i])){
                System.out.println(nums1[i]);
            }
        }

    }
}
