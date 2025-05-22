package Provatosoft;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] arr={8,8,5,6,4,7,2,3,1};
        Arrays.sort(arr);
        int highest=arr[arr.length-1];
        for (int i = arr.length-1; i >=0 ; i--) {
            if (arr[i]!=highest){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
