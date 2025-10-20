package String;

public class CountBinarySubstrings {
    public static void main(String[] args) {
        String s="00110011";
        int count=0;
        int prev=0;
        int current=1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1)==s.charAt(i)){
                current++;
            }else {
                count+=Math.min(prev,current);
                prev=current;
                current=1;
            }
        }
        count+=Math.min(prev,current);
        System.out.println(count);
    }

}
