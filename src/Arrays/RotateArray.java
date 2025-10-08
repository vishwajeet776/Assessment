package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        System.out.println(arr.length);
        rotateRight(arr,k);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    private static void rotateRight(int[] arr, int k) {
        reversArr(arr,0,arr.length-1);
        reversArr(arr,0,k-1);
        reversArr(arr,k, arr.length-1);

    }

    private static void reversArr(int[] arr,int i, int length) {
        int start=i;
        int end=length;
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

}
