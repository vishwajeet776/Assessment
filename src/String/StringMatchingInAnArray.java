package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatchingInAnArray {
    public static void main(String[] args) {
        String[] words = {"leetcoder","leetcode","od","hamlet","am"};
        List<String> l1=new ArrayList<>();
        Arrays.sort(words);
        
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]+" ");
            String temp=words[i];
            for (int j = i+1; j < words.length; j++) {
                if (words[j].contains(words[i])){
                    l1.add(words[i]);
                }
            }
        }
        System.out.println(l1);
    }
}
