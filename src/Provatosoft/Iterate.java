package Provatosoft;

import java.util.*;

public class Iterate {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Banana", 2);
        map.put("Apple", 4);
        map.put("Mango", 1);

//        1.for-each loop
        for (Map.Entry<String,Integer> it:map.entrySet()){
            System.out.println(it);
        }

//        2. keyset() iterator;
        Iterator<String> it= map.keySet().iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

//        3. entrySet() and for loop
        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(" "+list.get(i));
        }
        
        Set<String> set=map.keySet();
        Iterator<String> it1= set.iterator();
        while (it.hasNext()){
            System.out.println(it1.next());
        }

        TreeMap<String,Integer> tree=new TreeMap<>(map);
        System.out.println(tree);

//        Iterate
//        Iterator
//        Iterable

    }

}
