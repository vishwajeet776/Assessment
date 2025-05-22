package Provatosoft;

public class MaximumValueArray {
    public static void main(String[] args) {
        int[] arr={3, 8, 5, 7, 4};
        int max =Integer.MIN_VALUE;
        for (int num:arr){
            if (num> max){
                max =num;
            }
        }
        System.out.println(max);
    }
}
