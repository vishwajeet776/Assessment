package Provatosoft;

import java.lang.reflect.Array;
import java.util.*;

public class GroupOfAnagram {

        public static void main(String[] args) {

            String[] words = {"rat", "tat", "keep", "peek", "top", "pot"};
            Map<String,List<String>> map=new HashMap<>();

            for (String str:words){
                char[] temp=str.toCharArray();
                Arrays.sort(temp);
                String key=new String(temp);
                map.computeIfAbsent(key,k->new ArrayList<>()).add(str);
            }
            for (List<String> anagram:map.values()){
                System.out.println(anagram);
            }



        }
    }

