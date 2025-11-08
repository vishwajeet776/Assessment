package Arrays;

public class ShortestDistanceToCharacter {
    public static void main(String[] args) {
        String s="loveleetcode";
        char[] ch=s.toCharArray();
        int[] ans=new int[ch.length];
        int start=0;
        int end=0;
        for (int i = 0; i < s.length(); i++) {
            if (ch[i]=='e'){
                end=i;
                int count=end;
                while (end>=start){
                    ans[end]-=count;
                    count++;
                    end--;
                }
                start=end;
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i]+" ");
        }
    }
}
