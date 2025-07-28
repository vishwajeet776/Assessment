package Provatosoft;

import java.util.*;

public class longestSubstring {
    public static void main(String[] args) {
        String s="abcabcbb";

        int n=s.length();
        int left=0 , maxLen=0;
        Set<Character> set=new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen=Math.max(maxLen,right-left+1);
        }
        System.out.println(maxLen);

        String s1="pot";
        String s2="top";
        char[] ch1 =s1.toCharArray();
        char[] ch2 =s2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (ch1.equals(ch2)){
            System.out.println("is annagram");
        }else {
            System.out.println("is annagram");
        }

    }
}
