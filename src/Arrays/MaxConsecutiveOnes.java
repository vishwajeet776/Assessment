package Arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={1,1,0,1,1,1};
        int count=0;
        int current=0;
        for (int i:arr){
            if (i==1){
                current++;
                count=Math.max(current,count);
            }else {
                current=0;
            }
        }

        System.out.println(count);
    }
}
