package Provatosoft;

import java.util.*;

public class firstNonRepeatedChar {
    public static void main(String[] args) {
        String str="apple";

        Map<Character,Integer> map1=new LinkedHashMap<>();

        for (int i = 0; i < str.length(); i++) {
            map1.put(str.charAt(i),i);
        }

        HashMap<Character,Integer> map=new LinkedHashMap<>();

        for (char ch:str.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        System.out.println(map);

       Optional<Map.Entry<Character, Integer>> chr;
        chr = map.entrySet()
                .stream()
                .filter(ch ->ch.getValue()==1)
                .findFirst();
        System.out.println(chr+"  *********************");


        for (Map.Entry<Character,Integer> temp: map.entrySet()){
            if (temp.getValue()==1){
                System.out.println(temp.getKey());
                break;
            }
        }

    }
}
