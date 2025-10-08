package Provatosoft;

import java.util.*;
import java.util.stream.IntStream;

public class PrimeNumber {
    public static boolean isPrime(int n){
        return IntStream.rangeClosed(2, (int) Math.sqrt(n)).allMatch(div->n%div!=0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
      List<Integer> list= IntStream.rangeClosed(1,a)
               .filter(x->isPrime(x)).boxed().toList();

        System.out.println(list);
       // boolean ans =true;

//        for (int i = 1; i < Math.sqrt(a); i++) {
//            if (a%i != 0){
//                ans=false;
//            }
//        }
//        if (ans){
//            System.out.println(a+" is prime");
//        }else {
//            System.out.println(a+" is not prime");
//        }
    }
}
