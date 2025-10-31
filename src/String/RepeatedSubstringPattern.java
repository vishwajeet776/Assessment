package String;

public class RepeatedSubstringPattern {
    public static void main(String[] args) {
        String s = "ababab";
        String concat=s+s;
        System.out.println(concat.substring(1,concat.length()-1).contains(s));
    }
}
