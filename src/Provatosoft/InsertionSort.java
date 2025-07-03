package Provatosoft;

public class InsertionSort {

    public static void insertionSort(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int key =arr[i];
//            int j=i-1;
//            while (arr[j]> key && j>=0){
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=key;
//        }
        for (int i = 1; i < arr.length; i++) {
            int key= arr[i];
            int j=i+1;
            while (arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }


    public static void main(String[] args) {
        int[] arr={3, 8, 5, 7, 4};
        insertionSort(arr);
        for (int num:arr){
            System.out.println(num);
        }
    }
}
