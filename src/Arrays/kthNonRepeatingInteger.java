package Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class kthNonRepeatingInteger {
    public static void main(String[] args) {
        int[] Input= {1, 2, 5, 3, 4, 5, 4, 1};
        int k=2;
        Stream<Integer> ans=Arrays.stream(Input).distinct().skip(k).limit(k).boxed();
        System.out.println(ans);
    }
}
