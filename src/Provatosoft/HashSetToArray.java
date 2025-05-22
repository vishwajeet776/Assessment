package Provatosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>(Arrays.asList(4,5,8,3,7,4));
        System.out.println(set);
//        Integer[] arr=set.toArray(new Integer[0]);
        ArrayList<Integer> arr=new ArrayList<>(set);

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
