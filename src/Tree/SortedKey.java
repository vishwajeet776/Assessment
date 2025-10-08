package Tree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedKey {
    public static void main(String[] args) {
        String str = "Vishwajeet";
        TreeMap<Character,Integer> treeMap=new TreeMap<>();
        for (char ch:str.toCharArray()){
            treeMap.put(ch,treeMap.getOrDefault(ch,0)+1);
        }
        System.out.println(treeMap);
        Map<Character,Integer> lkdHash=new LinkedHashMap<>();
        for (char ch:str.toCharArray()){
            lkdHash.put(ch, lkdHash.getOrDefault(ch,0)+1);
        }
        System.out.println(lkdHash);
    }
}
