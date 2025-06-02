package Provatosoft;

public class Sort0s1sAnd2s {
    public static void main(String[] args) {
        int[] arr={0, 1, 2, 0, 1, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i:arr){
            System.out.print(i);
        }
    }
}
