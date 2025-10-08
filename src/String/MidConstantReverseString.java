package String;

import java.util.Arrays;

public class MidConstantReverseString {
    public static void main(String[] args) {
        String s="Vishwajeet";
        char[] ch=s.toCharArray();
        int mid= (ch.length/2)-1;
        System.out.println(mid+" "+s.charAt(mid));
        reverseString(ch,0, mid-1);
        reverseString(ch,mid+1, ch.length-1);
        System.out.println(new String(ch));
    }
    public static void reverseString(char[] ch,int start,int end){
        int s=start;
        int e=end;
        while (s<e){
          char temp=ch[s];
          ch[s]=ch[e];
          ch[e]=temp;
          e--;
          s++;
        }
    }
}
