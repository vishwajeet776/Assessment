package Provatosoft;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean ans =true;
        for (int i = 1; i < Math.sqrt(a); i++) {
            if (a%i != 0){
                ans=false;
            }
        }
        if (ans){
            System.out.println(a+" is prime");
        }else {
            System.out.println(a+" is not prime");
        }
    }
}
