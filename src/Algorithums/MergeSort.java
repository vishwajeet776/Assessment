package Algorithums;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] ={10,15,20,40,8,11,55};
        int low=0;
        int high=6;

        divide(arr,low,high);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void divide(int[] arr,int low,int high){
        if (low<high){
            int mid=low+(high-low)/2;
            divide(arr,low,mid);
            divide(arr, mid+1, high);
            merge(arr,low,mid,high);
        }
    }
    public static void merge(int[] arr,int low,int mid,int high){

        int l=low;
        int r=mid+1;
        int count=0;

        int[] temp=new int[high-low+1];

        while (l<=mid && r<=high){
            if (arr[l]<=arr[r]){
                temp[count++]=arr[l++];
            }else {
                temp[count++]=arr[r++];
            }
        }
        while (l<=mid){
            temp[count++]=arr[l++];
        }
        while (r<=high){
            temp[count++]=arr[r++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[low+i]=temp[i];
        }

    }
}
