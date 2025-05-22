package Provatosoft;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayListInDescending {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(6,4,7,5,2,1,2));
        System.out.println(arr);

        Collections.sort(arr);
        System.out.println(arr);

//        Sort in Descending Order

        Collections.sort(arr,Collections.reverseOrder());
        System.out.println(arr);

//        using stream
        List<Integer> list=arr.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(list);
    }
}
