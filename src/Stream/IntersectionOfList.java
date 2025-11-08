package Stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class IntersectionOfList {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,2,3,4,5,6);
        List<Integer> l2= Arrays.asList(5,6,7,8,9,10,13);
        int ans=l1.stream().filter(x->l2.contains(x)).findFirst().orElse(-1);
        System.out.println(ans );
    }
}
