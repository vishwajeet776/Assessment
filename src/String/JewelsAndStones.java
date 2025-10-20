package String;

import java.util.HashSet;
import java.util.Set;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aAA", stones = "aAAbbbb";
        int count=0;
        Set<Character> set=new HashSet<>();
        for (int i = 0; i < jewels.length(); i++) {
            set.add(jewels.charAt(i));
        }
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i))){
                count++;
            }
        }
        System.out.println(count);
    }
}
