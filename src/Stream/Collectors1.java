package Stream;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collectors1 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(Arrays.asList("Anna","bob","Alexander","Brian","Alice"));
        System.out.println(list.stream().collect(Collectors.groupingBy(String::length)));

        String s="Anna bob Alexander Brian Alice";
//        Arrays.stream(s.split(" ")).collect();
    }
}
