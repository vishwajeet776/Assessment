package Arrays;

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int count=0;
        for (int i:nums){
            String temp=String.valueOf(i);
            if (temp.length()%2==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
