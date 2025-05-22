package Provatosoft;

import java.util.*;

public class HashMapSort {
    public static void main(String[] args) {
        HashMap<Integer,String> hash=new HashMap<>();
        hash.put(33,"z");
        hash.put(22," A");
        hash.put(55," B");
        hash.put(88," X");
        hash.put(44," M");

        TreeMap<Integer,String> treeMap=new TreeMap<>(hash);
        List<Map.Entry<Integer,String>> list=hash.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).toList();
        System.out.println(list);

        System.out.println(treeMap);

    }
}
