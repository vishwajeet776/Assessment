package Provatosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArraylistSort {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(1,82,3,4,56));
        Collections.sort(arr);
        System.out.println(arr);
    }
}
