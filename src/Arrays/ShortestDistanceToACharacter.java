package Arrays;

public class ShortestDistanceToACharacter {
    public static void main(String[] args) {
        String s = "loveleetcode";
        char[] ch=s.toCharArray();
        int[] ans=new int[ch.length];
        int idx=0;
        int start=0;
        for (int i = 0; i < ch.length ; i++) {
            if (ch[i]=='e'){
                idx=i;
                int end=idx-1;
                while(end>=start){
                    ans[end]+=1;
                    end--;
                }
                start=idx+1;
            }
        }
        for (int i:ans){
            System.out.print(i+" ");
        }
    }
}
