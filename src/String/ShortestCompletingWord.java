package String;

import java.util.HashMap;
import java.util.Map;

public class ShortestCompletingWord {
    public static void main(String[] args) {
        String licensePlate = "1s3 PSt";
        String[] words = {"step","steps","stripe","stepple"};
        System.out.println(licensePlate.toLowerCase());

        String shortest=null;
        Map<Character,Integer> map=new HashMap<>();
        for (char ch:licensePlate.toLowerCase().toCharArray()){
            if (ch>96 && ch<123){
                map.put(ch, map.getOrDefault(ch,0)+1);
            }
        }
        System.out.println(map);
        for (String w:words){
            Map<Character,Integer> temp=new HashMap<>();
            for (char ch:w.toCharArray()){
                temp.put(ch, temp.getOrDefault(ch,0)+1);
            }
            boolean valid=true;
            for (Map.Entry<Character,Integer> entry: map.entrySet()){
                char key= entry.getKey();
                int value= entry.getValue();
                if (temp.getOrDefault(key,0)<value){
                    valid=false;
                    break;
                }
            }
            if (valid && (shortest==null || w.length()<shortest.length())){
                shortest=w;
            }
        }
        System.out.println(shortest);
    }
}
