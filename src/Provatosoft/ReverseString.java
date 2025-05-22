package Provatosoft;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String str="Vishwajeet";


//        without using String inbuilt functions.

        int left=0;
        int right=str.length()-1;
        char[] strArr=str.toCharArray();
        while (left<=right){
            char temp=strArr[left];
            strArr[left]=strArr[right];
            strArr[right]=temp;
            left++;
            right--;
        }
        String ans=new String(strArr);
        System.out.println(ans);

//        using String inbuilt functions
        String rev=new StringBuilder(str).reverse().toString();
        System.out.println(rev);

//        StringBuilder str1=new StringBuilder(str);
    }
}
