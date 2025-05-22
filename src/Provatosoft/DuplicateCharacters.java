package Provatosoft;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Set;

public class DuplicateCharacters {

    public static void main(String[] args) {
        String str="applle";
        Set<Character> set=new HashSet<>();
        for (int i = 0; i <str.length(); i++) {
            if (set.contains(str.charAt(i))){
                System.out.println(str.charAt(i));
            }
            set.add(str.charAt(i));
        }
    }
}
