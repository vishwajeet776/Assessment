package Arrays;

import java.util.*;

public class MinimumIndexSumofTwoLists {
    public static void main(String[] args) {
       String[] list1 = {"Shogun","Tapioca Express","Burger King","KFC"};
       String[] list2 = {"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

       String str=new String();
       Map<String,Integer> map=new LinkedHashMap<>();
       for (int i=0;i< list1.length;i++){
           map.put(list1[i],i);
       }
        List<String> result = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int j = 0; j < list2.length; j++) {
            if (map.containsKey(list2[j])) {
                int sum = map.get(list2[j]) + j;
                if (sum < min) {
                    result.clear();
                    result.add(list2[j]);
                    min = sum;
                } else if (sum == min) {
                    result.add(list2[j]);
                }
            }
        }
        System.out.println(result);

    }
}
