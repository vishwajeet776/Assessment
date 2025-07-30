package Provatosoft;

import java.util.*;

public class AnagramFind {
    public static void main(String[] args) {

        String input[]={"listen", "silent", "enlist", "rat", "tar", "art",  "god", "dog"};
        Map<String, List<String>> map=new HashMap<>();
        for (String s:input){
            char[] ch= s.toCharArray();
            Arrays.sort(ch);
            String str=new String(ch);
            map.computeIfAbsent(str,t->new ArrayList<>()).add(s);
        }
        System.out.println(map);
    }
}
