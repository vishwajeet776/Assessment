package String;

import java.util.Arrays;
import java.util.stream.Stream;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String str="Hello World";
        String[] arr=str.split(" ");
        String temp=arr[arr.length-1];
        System.out.println(temp.length());


    }
}
