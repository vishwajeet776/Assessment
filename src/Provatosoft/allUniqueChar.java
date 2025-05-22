package Provatosoft;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class allUniqueChar {
    public static boolean UniqueChar(String str){
        Set<Character> set=new HashSet<>();
        for (int i = 0; i <str.length(); i++) {
            if (set.contains(str.charAt(i))){
                return false;
            }
            set.add(str.charAt(i));
        }
        return  true;
    }
    public static void main(String[] args) {
        String str="qwerrty";

//        first approach
       char[] ch=str.toCharArray();
       Arrays.sort(ch);
        for (int i = 1; i < str.length(); i++) {
            if (ch[i]==ch[i-1]){
                System.out.println("false");
            }
        }

//        second approach
        System.out.println(UniqueChar(str));
    }
}
