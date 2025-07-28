package Stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PartitionList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));

//        List<Integer> l1=;
        System.out.println(collect.get(true));
        System.out.println(collect.get(false));

        Stream<Integer> stream=numbers.stream().filter(x->x%2==0);


    }
}
