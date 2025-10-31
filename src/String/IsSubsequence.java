package String;

import java.util.LinkedList;
import java.util.Queue;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";

        int left=0;
        int right=0;
        while ( left<s.length() && right<t.length()){
            if (s.charAt(left)==t.charAt(right)){
                left++;
                right++;
            }else {
                right++;
            }
        }
        System.out.println(left==s.length());
    }
}
