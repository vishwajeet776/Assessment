package String;

import java.util.Arrays;

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        char[] ch=s.toCharArray();
        int left=0;
        int right= ch.length-1;
        while (left<right){
            boolean l=Character.isLetter(ch[left]);
            boolean r=Character.isLetter(ch[right]);
            if (l && r){
                char temp=ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            } else if (!l) {
                left++;
            }else {
                right--;
            }
        }
        String ans="";
        for (int i = 0; i < ch.length; i++) {
            ans+=ch[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        String str="ab-Wd";
        System.out.println(reverseOnlyLetters(str));

//        char[] ch=str.toCharArray();
//        System.out.println(Character.isLetter(ch[3]));
//        int left=0;
//        int right= ch.length-1;
//        while (left<right){
//            boolean l=Character.isLetter(ch[left]);
//            boolean r=Character.isLetter(ch[right]);
//            if (l && r){
//                char temp=ch[left];
//                ch[left]=ch[right];
//                ch[right]=temp;
//                left++;
//                right--;
//            } else if (!l) {
//                left++;
//            }else {
//                right--;
//            }
//        }
//        String ans=ch.toString();
//        System.out.println(ans);
//        for (char i:ch){
//            System.out.print(i);
//        }
    }
}
