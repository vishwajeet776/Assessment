package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOps {
    public static void main(String[] args) {

//        filter - use predicate
        List<Integer> list=new ArrayList<>(Arrays.asList(1,82,93,4,56,67,47,18,39));
        long stream= list.stream().filter(x->x%2==0).count();
        System.out.println(stream);

//        map - use function
        List<String> list1=new ArrayList<>(Arrays.asList("Akshit","ritwek","mayr","Ghansham","Rohan","ritwek"));
        List<String> a = list1.stream().filter(x -> x.startsWith("A")).toList();
        System.out.println(a);

        List<String> b = list1.stream().map(String::toUpperCase).toList();
        System.out.println(b);

//        sort
        List<Integer> c = list.stream().sorted().toList();
        System.out.println(c);

//        distinct
        List<String> d = list1.stream().distinct().toList();
        System.out.println(d);

//        limit
        System.out.println(Stream.iterate(1,x->x+1).limit(10).count());

//        skip
        System.out.println(Stream.iterate(1,x->x+1).skip(10).limit(100).count());

//        Example
        List<String> e = list1.stream().filter(x -> x.length() > 5).toList();
        System.out.println(e);

    }
}
