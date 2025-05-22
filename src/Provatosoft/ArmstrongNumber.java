package Provatosoft;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num =153;
        int original= num;
        int result=0;
        int n=String.valueOf(num).length();
        while(num!=0){
            int digit =num%10;
            result+=Math.pow(digit,n);
            num/=10;
        }

        if (result == original) {
            System.out.println("is armstrong number");
        }else {
            System.out.println("is not armstrong");
        }
    }
}
