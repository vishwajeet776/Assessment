package Algorithums;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int minIdx=i;
//            for (int j = i; j < arr.length ; j++) {
//                if (arr[j]<arr[minIdx]){
//                    minIdx=j;
//                }
//            }
//            int temp=arr[i];
//            arr[i]=arr[minIdx];
//            arr[minIdx]=temp;
////        }
            for (int i = 0; i < arr.length; i++) {
                int sIndex=i;
                for (int j = i+1; j < arr.length ; j++) {
                    if (arr[sIndex]>arr[j]){
                        sIndex=j;
                    }
                }
                int temp=arr[sIndex];
                arr[sIndex]=arr[i];
                arr[i]=temp;
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
