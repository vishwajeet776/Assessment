package String;

import java.util.HashSet;
import java.util.Set;

public class MinimizeStringLength {
    public static void main(String[] args) {
        String s = "baadccab";

        Set<Character> set=new HashSet<>();
        for (char ch:s.toCharArray()){
            set.add(ch);
        }
        System.out.println(set.size());
    }
}
