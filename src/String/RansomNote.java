package String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        boolean ans=true;
        String ransomNote="aa";
        String magazine="baa";
//        System.out.println(magazine.contains(ransomNote));
        Map<Character,Integer> map=new HashMap<>();
        for (char ch:magazine.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        for (char ch:ransomNote.toCharArray()){
            if (!map.containsKey(ch) || map.get(ch)<=0){
                ans=false;
            }else {
                map.put(ch,map.get(ch)-1);
            }
        }
        System.out.println(ans);
    }
}
