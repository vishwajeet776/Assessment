package String;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {

        String str="abba";
        String s="dog cat cat get";
        String[] s1=s.split(" ");
        boolean ans=true;
        Map<Character,String> map1=new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (map1.containsKey(str.charAt(i)) & !s1[i].equals(map1.get(str.charAt(i)))){
                ans=false;
            }else {
                map1.put(str.charAt(i), s1[i]);
            }
        }
        System.out.println(ans);

    }
}
