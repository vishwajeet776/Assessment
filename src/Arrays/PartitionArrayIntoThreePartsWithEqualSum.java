package Arrays;

public class PartitionArrayIntoThreePartsWithEqualSum {
    public static void main(String[] args) {
        int[] arr = {3,3,6,5,-2,2,5,1,-9,4};
        int sum=0;
        for (int i:arr){
            sum+=i;
        }
        System.out.println(sum);
        System.out.println(sum/3);
        int temp=0;
        int count=0;
        boolean ans=false;
        for (int i = 0; i < arr.length; i++) {
            temp+=arr[i];
            if (temp==sum/3){
               count++;
               temp=0;
                if (count==2 && i<arr.length){
                    ans=true;

                }
            }

        }
        System.out.println(ans);

    }
}
