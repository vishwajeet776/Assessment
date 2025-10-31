package String;

public class RotateString {
    public static void main(String[] args) {
        String s = "abcde", goal = "cdeab";
        String temp=s+s;
        System.out.println(s+s);
        if (temp.contains(goal)){
            System.out.print("true");
        }
    }
}
