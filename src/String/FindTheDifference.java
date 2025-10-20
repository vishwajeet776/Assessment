package String;

import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

    public static char firstMethod(String s,String t){
        int result=0;
        for (char ch:s.toCharArray()){
            result ^=ch;
        }

        for (char ch:t.toCharArray()){
            result ^=ch;
        }

        return(char)result ; //Casting (char) just interprets the final integer as a character.

    }

    public static char secoundMethod(String s,String t){
        int sum=0;

        for (char ch:t.toCharArray()){ //sum = sum(t) - sum(s) = extraChar
            sum+=ch;
        }

        for (char ch:s.toCharArray()){
            sum-=ch;
        }

        return (char)sum;
    }

    public static void main(String[] args) {

        String s = "abcd", t = "abcde";

        System.out.println(firstMethod(s,t));
        System.out.println(secoundMethod(s,t));
    }
}
