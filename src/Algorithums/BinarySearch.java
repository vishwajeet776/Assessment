package Algorithums;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr={2,9,5,3,7,4,1,8};
        int target=5;
        Arrays.sort(arr);
        System.out.println(binarySearch(arr,target));
    }
    public static int binarySearch(int [] arr,int target){
        int left=0;
        int right= arr.length;
        while(right>left){
            int mid=left+(right-left)/2;
            if (mid==target){
                return mid;
            } else if (target<arr[mid]) {
                right=mid;
            }else {
                left=mid;
            }
        }
        return -1;
    }
}
