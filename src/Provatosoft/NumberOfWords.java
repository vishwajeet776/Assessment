package Provatosoft;

public class NumberOfWords {
    public static void main(String[] args) {
        String str="Write a Java Program to Count number of words in the String";
        int num=0;

        //        first approach
        for (String s:str.split(" ")){
            num++;
        }
        System.out.println(num);


        //        second approach
        String[] ans=str.split(" ");
        System.out.println(ans.length);
    }
}
