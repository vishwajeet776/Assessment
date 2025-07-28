package Provatosoft;
class temp{
    static {
        System.out.println("from static block");
    }
    static int age =24 ;
}
public class StaticKeyWord {
    public static void main(String[] args) {
        int a=temp.age;
        System.out.println(a);
    }
}
