package Provatosoft;

import java.util.HashMap;

public class RemoveKeyValueMapping {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("Java", 1);
        map.put("Python", 2);
        map.put("C++", 3);

        System.out.println(map);
        map.remove("C++");

        System.out.println(map);
    }
}
