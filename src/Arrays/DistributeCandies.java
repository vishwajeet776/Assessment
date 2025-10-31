package Arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {
        int[] candyType = {1,1};

        Set<Integer> set=new HashSet<>();
        for (int i:candyType){
            set.add(i);
        }
        if (candyType.length/2 == set.size()){
            System.out.println(set.size());
        } else if (candyType.length/2 < set.size()) {
            System.out.println(candyType.length/2);
        }else {
            System.out.println(set.size());
        }
    }
}
