package Provatosoft;

public class FindVowels {
    public static void main(String[] args) {

        String name="vishwajeet";
        String vowels= name.replaceAll("[^aeiouAEIOU]","");
        String notVowels=name.replaceAll("[AEIOUaeiou]","");

        if(!vowels.isEmpty()){
            System.out.println("vowels: "+vowels);
            System.out.println("not: "+ notVowels);
        }
    }
}
