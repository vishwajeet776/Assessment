package Provatosoft;

public class Factorial {
    public static void main(String[] args) {
        int num=5;
        int ans=1;
        for (int i = 1; i <=num ; i++) {
            ans*=i;
        }
        System.out.println(ans);
        System.out.println(factorial(num));
    }

    public static int factorial(int num) {
        if (num==0 || num==1){
            return 1;
        }
        return num*factorial(num-1);
    }
}
