package Provatosoft;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class countOccurrences {
    public static void main(String[] args) {
        String str="Java Hungry";

        HashMap<Character,Integer> map=new LinkedHashMap<>();

        for (char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        System.out.println(map);
    }
}
