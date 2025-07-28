package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TerminalOps {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));

//        collector
        List<Integer> a = list.stream().skip(1).toList();
        System.out.println(a);

//        foreach
        list.stream().forEach(x-> System.out.println(x));

//        anyMatch
        System.out.println(list.stream().anyMatch(x->x%2==0));

        System.out.println(list.stream().allMatch(x->x%2==0));

//        Example -find the squre root and then sort
        List<Integer> list1=new ArrayList<>(Arrays.asList(5,2,9,1,6));

        System.out.println(list1.stream().map(x -> x * x).sorted().toList());

//        Example -count char in string
//        s.chars() stream of char ASCI value
        String s="Hello world";
        System.out.println(s.chars().filter(x->x=='l').count());

    }
}
