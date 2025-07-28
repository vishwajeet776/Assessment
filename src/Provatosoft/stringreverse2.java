package Provatosoft;

public class stringreverse2 {
    public static void main(String[] args) {
        String a="vishwajeet";
        /*
        tveiesjhaw
         */
//        hsivwteeja
        int mid=a.length()/2;
        System.out.println(a.charAt(mid));
        StringBuilder str=new StringBuilder(a);
        System.out.println();

        StringBuilder temp1=new StringBuilder(str.substring(0,mid-1)).reverse();

        StringBuilder temp2=new StringBuilder(str.substring(mid+1,a.length())).reverse();
        System.out.print(temp1+""+a.charAt(mid-1)+temp2);


    }
}
