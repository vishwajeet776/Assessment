package Provatosoft;

public class palindrome {
    public static void main(String[] args) {
        String str="madam";
        int left=0;
        int right=str.length()-1;
        char[] strArr=str.toCharArray();
        boolean ans=true;
        while (left<=right){
            if (strArr[left]!=strArr[right]){
                ans=false;
            }
            left++;
            right--;
        }
        if (ans){
            System.out.println("is palindrome");
        }
        else {
            System.out.println("not palindrome");
        }

        String new_str=new StringBuilder(str).reverse().toString();
        if (str.equals(new_str)){
            System.out.println("is palindrome");
        }
        else {
            System.out.println("not Palindrome");
        }
    }
}
