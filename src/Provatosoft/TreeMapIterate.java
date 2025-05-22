package Provatosoft;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeMapIterate {
    public static void main(String[] args) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        treeSet.add(6);
        treeSet.add(5);
        treeSet.add(7);
        treeSet.add(8);
        System.out.println(treeSet);
        Iterator<Integer> it= treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
