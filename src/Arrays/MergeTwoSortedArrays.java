package Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        int arr1[] = {1, 3, 4, 5};
        int arr2[] = {2, 4, 6, 8};

        int [] arr=new int[arr1.length+arr2.length];
        int x=0;
        int y=0;
        int count= 0;

        while (x<arr1.length && y<arr2.length ){
            if (arr1[x]<=arr2[y]){
                arr[count++]=arr1[x++];
            }else {
                arr[count++]=arr2[y++];
            }
        }


        while (x< arr1.length){
            arr[count++]=arr1[x++];
        }
        while (y< arr2.length){
            arr[count++]=arr2[y++];
        }


        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
