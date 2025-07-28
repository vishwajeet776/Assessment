package Stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;

public class LongestString {
    public static void main(String[] args) {

        List<String> words = List.of("cat", "elephant", "dog");

        System.out.println(words.stream().max(Comparator.comparing(String::length)));
        words.stream().max(Comparator.comparing(String::length));

        Map< Integer,String> map = words.stream()
                .collect(Collectors
                        .toMap( s -> s.length(),s -> s,(oldV,new_value)->oldV));


        Map<Object, List<String>> stream=words.stream()
                .collect(Collectors.groupingBy(s ->s.length()));
        System.out.println(stream);

        System.out.println(map);

       List<String> sort= words.stream().sorted(Comparator.comparing(s->s.length())).toList();
        System.out.println(sort);
    }
}
