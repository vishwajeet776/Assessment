package Arrays;

public class IntegerIntoDigits {
    public static char[] seprateInteger1(int x){
        char[] ch=String.valueOf(x).toCharArray();
        return ch;
    }
    public static void main(String[] args) {
        int n=121;
        char[] ch=String.valueOf(n).toCharArray();
        int left=0;
        int right=ch.length-1;
        boolean ans=true;
        while (left<right){
            if (ch[left]!=ch[right]){
                ans=false;
                break;
            }
            left++;
            right--;
        }

        if (ans){
            System.out.println(n +" is palindrom");
        }else {
            System.out.println("is not palindrom");
        }

    }
}
