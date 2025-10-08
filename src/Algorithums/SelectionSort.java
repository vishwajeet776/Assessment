package Algorithums;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIdx=i;
            for (int j = i; j < arr.length ; j++) {
                if (arr[j]<arr[minIdx]){
                    minIdx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;
        }
    }

    public static void main(String[] args) {
        int[] arr={3, 8, 5, 7, 4};
        selectionSort(arr);
        for (int num:arr){
            System.out.print(num+" ");
        }
    }
}
