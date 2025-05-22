package Provatosoft;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListToArrayList {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(5);
        ll.add(7);
        ll.add(8);
        ll.add(1);
        ll.add(9);
        System.out.println(ll);

        ArrayList<Integer> arr=new ArrayList<>(ll);
        System.out.println(arr);

    }
}
