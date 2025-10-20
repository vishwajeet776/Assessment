package Algorithums;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr={3,5,4,9,5,7,1,2,8};
        int n= arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i:arr){
            System.out.print(i+" ");
        }

    }
}
