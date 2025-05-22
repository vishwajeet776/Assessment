package Provatosoft;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        int [] array1= {1,4,7, 9, 2},  arrray2 = {1,7,3,4,5};
        Set<Integer> set =new HashSet<>();
        for (int a:array1){
            set.add(a);
        }
        for (int a:arrray2){
            if (set.contains(a)) {
                System.out.println(a);
            }
        }
    }
}
