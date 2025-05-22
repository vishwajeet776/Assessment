package Provatosoft;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class ArrayToTreeSet {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(9,5,7,5,4,6));
        System.out.println(arr);
        TreeSet<Integer> tree=new TreeSet<>(arr);

        System.out.println(tree);
    }
}
