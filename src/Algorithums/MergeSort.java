package Algorithums;

public class MergeSort {

    public static void main(String[] args) {
        int arr[] ={10,15,20,40,8,11,55};
        int low=0;
        int high=6;

        mergeSort(arr,low,high);

        for (int i:arr){
            System.out.print(i+" ");
        }

    }
//    public static void mergeSort(int[] arr, int low, int high){
//        if (low<high){
//            int mid=low+(high-low)/2;
//            mergeSort(arr, low, mid);
//            mergeSort(arr, mid+1, high);
//            merge(arr,low,mid,high);
//        }
//    }

//    private static void merge(int[] arr, int low, int mid, int high) {
//        int l=low;
//        int r=mid+1;
//        int temp[]=new int[high-low+1];
//        int count=0;
//        while (l<=mid && r<=high){
//            if (arr[l]<arr[r]){
//                temp[count++]=arr[l++];
//            }else {
//                temp[count++]=arr[r++];
//            }
//        }
//        while (l<=mid){
//            temp[count++]=arr[l++];
//        }
//        while (r<=high){
//            temp[count++]=arr[r++];
//        }
//        for (int i = 0; i < temp.length; i++) {
//            arr[low+i]=temp[i];
//        }
//    }

    public static void mergeSort(int[] arr,int l,int h){
        if (l<h){
            int mid=l+(h-l)/2;
            mergeSort(arr,l,mid);
            mergeSort(arr,mid+1,h);
            marge(arr,l,mid,h);
        }
    }

    private static void marge(int[] arr, int l, int mid, int h) {
        int left=l;
        int right=mid+1;
        int[] temp=new int[h-l+1];
        int count=0;
        while (left<= mid && right<=h){
            if (arr[left]<arr[right]){
                temp[count++]=arr[left++];
            }else {
                temp[count++]=arr[right++];
            }
        }
        while (left<=mid){
            temp[count++]=arr[left++];
        }
        while (right<=h){
            temp[count++]=arr[right++];
        }
        for (int i=0;i< temp.length;i++){
            arr[l+i]=temp[i];
        }
    }
}
