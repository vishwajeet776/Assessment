package Provatosoft;

public class palindrome {
    public static void main(String[] args) {
        String str="madamd";
//        int left=0;
//        int right=str.length()-1;
//        char[] strArr=str.toCharArray();
//        boolean ans=true;
//        while (left<=right){
//            if (strArr[left]!=strArr[right]){
//                ans=false;
//            }
//            left++;
//            right--;
//        }
//        if (ans){
//            System.out.println("is palindrome");
//        }
//        else {
//            System.out.println("not palindrome");
//        }
//
//        String new_str=new StringBuilder(str).reverse().toString();
//        if (str.equals(new_str)){
//            System.out.println("is palindrome");
//        }
//        else {
//            System.out.println("not Palindrome");
//        }

        int start=0;
        int end=str.length()-1;
        boolean ans =true;
        while (start<end){

            if (str.charAt(start) != str.charAt(end)) {
                ans=false;

            }

            start++;
            end--;
        }
        if (ans) {
            System.out.println("is a palindrom");
        }else {
            System.out.println("not a palindrom");
        }

        String temp=new StringBuilder(str).reverse().toString();
        if (temp.equals(str)){
            System.out.println("is a palindrom");
        }else {
            System.out.println("not a palindrom");
        }

        String s1="A man, a plan, a canal, Panama";
        String string = s1.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        System.out.println(string);
    }
}
