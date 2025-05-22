package Provatosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListIterate {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(3,5,1,8,9,6,7));
//        for loop, for
//each loop, While loop, Iterator and Collection's stream() util

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }
        System.out.println();

        for (int num:arr){
            System.out.print(num+" ");
        }
        System.out.println();
        int i= 0;
        while (i<arr.size()){
            System.out.print(arr.get(i)+" ");
            i++;
        }

        System.out.println();
        Iterator<Integer> it=arr.iterator();
        while (it.hasNext()){
            System.out.print(it.next()+" ");
        }

    }
}
