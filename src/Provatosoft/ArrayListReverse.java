package Provatosoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>(Arrays.asList("Apple", "Amazon", "Facebook", "Google", "IBM","Tesla"));
        Collections.reverse(arr);
        ArrayList<String> ans=arr.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
        System.out.println(ans);
    }
}
