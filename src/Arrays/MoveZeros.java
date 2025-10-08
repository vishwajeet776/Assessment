package Arrays;

public class MoveZeros {
    public static void main(String[] args) {

        int arr[]={0,1,2,0,3,54,5,0};
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
        int idx=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]!=0){
                arr[idx++]=arr[i];

            }
        }
        while (idx< arr.length){
            arr[idx++]=0;

        }

        for (int i:arr){
            System.out.print(i+" ");
        }


    }
}
