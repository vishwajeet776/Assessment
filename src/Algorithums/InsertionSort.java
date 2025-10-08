package Algorithums;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr={5,3,4, 1, 2,8,6};
        int n=arr.length;
        for (int i = 1; i <n; i++) {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
}
