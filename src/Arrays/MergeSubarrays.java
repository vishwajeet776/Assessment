package Arrays;

public class MergeSubarrays {
    public static int[] m(int[] arr,int low,int mid,int high){
        int[] marge=new int[arr.length];
        int l=0,r=mid+1,count=0;
        while (l<=mid && r<=6){
            if (arr[l]<=arr[r]){
                marge[count++]=arr[l++];
            }
            else {
                marge[count++]=arr[r++];
            }
        }

        while (l<=mid){
            marge[count++]=arr[l++];
        }
        while (r<=high){
            marge[count++]=arr[r++];
        }
        return marge;
    }
    public static void main(String[] args) {
//        Given
        int[] arr ={10,15,20,40,8,11,55};
        int low=0;
        int mid=3;
        int high=6;

//        int[] marge=new int[arr.length];
//        int l=0,r=mid+1,count=0;
//        while (l<=mid && r<=6){
//            if (arr[l]<=arr[r]){
//                marge[count++]=arr[l++];
//            }
//            else {
//                marge[count++]=arr[r++];
//            }
//        }
//
//        while (l<=mid){
//            marge[count++]=arr[l++];
//        }
//        while (r<=high){
//            marge[count++]=arr[r++];
//        }

        for (int i:m(arr,low,mid,high)){
            System.out.print(i+" ");
        }
    }
}
