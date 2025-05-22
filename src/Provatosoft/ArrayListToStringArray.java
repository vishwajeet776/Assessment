package Provatosoft;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListToStringArray {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>(Arrays.asList("a","v","g","t","d"));
        System.out.println(arr);
        String[] str=arr.toArray(new String[0]);
        for (String s:str){
            System.out.println(s);
        }
    }
}
