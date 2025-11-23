package Arrays;

public class ValidMountainArray {
    public static boolean validMountainArray(int[] arr) {
        int n=arr.length;
        if(n<=3){
            return false;
        }
//        boolean temp=true;
        int pik=0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1]>=arr[i]){
                pik=i-1;
                break;
            }
        }
        for (int i = pik+1; i < n; i++) {
            if (arr[i-1]<arr[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr={0,2,3};
        System.out.println(validMountainArray(arr));
    }
}
