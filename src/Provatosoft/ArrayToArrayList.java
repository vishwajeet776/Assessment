package Provatosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayToArrayList {
    public static void main(String[] args) {
        int[] arr={8,5,4,2,7,3};
        ArrayList<Integer> arrayList=new ArrayList<>();
//        for (int num:arr){
//            arrayList.add(num);
//        }
//        System.out.println(arrayList);

        ArrayList<Integer> arrayList1=Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(arrayList1);

    }
}
