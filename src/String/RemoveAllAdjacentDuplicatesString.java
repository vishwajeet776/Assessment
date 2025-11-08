package String;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveAllAdjacentDuplicatesString {
    public static void main(String[] args) {
        String s = "aababaab";
        StringBuilder sb=new StringBuilder(s);
        Set<Character> set=new LinkedHashSet<>();
        for (char ch:s.toCharArray()){
            if (set.contains(ch)){
                set.remove(ch);
            }else {
                set.add(ch);
            }
        }
        String ans="";
        for (char ch:set){
            ans+=ch;
        }

        System.out.println(ans);
    }
}
