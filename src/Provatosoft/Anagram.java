package Provatosoft;

import java.util.*;

public class Anagram {
    public static void main(String[] args) {
        String s1="ytrewq";
        String s2="eytrqw";
        char[] ch=s1.toCharArray();
        char[] ch2=s2.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(ch2);
        if (Arrays.equals(ch,ch2)){
            System.out.println("is anagram");
        }else {
            System.out.println("not");
        }
        Queue<Integer> q=new LinkedList<>();

    }
}
