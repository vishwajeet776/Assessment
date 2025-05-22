package Provatosoft;

public class RemoveAllTheWhiteSpaces {
    public static void main(String[] args) {
        String str=" i like coffee";
        String[] temp=str.split(" ");
        String ans="";
        for (String s:temp){
            ans+=s;
            System.out.println(s);
        }
        System.out.println(ans);

    }
}
