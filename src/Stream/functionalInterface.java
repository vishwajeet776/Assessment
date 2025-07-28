package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class functionalInterface {
    public static void main(String[] args) {

        MathOpration sum=(a,b)->a+b;
        System.out.println(sum);

        Predicate<Integer> predicate = x->x%2==0;
        Function<Integer,Integer> function=x->x*x;
        Consumer<Integer> consumer=x-> System.out.println(x);
        Supplier<Integer> supplier=()-> 6;

        if (predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8) ;


//        System.out.println(isEven.test(3));
    }
    @FunctionalInterface
    interface MathOpration{
       int opration(int a,int b);
    }
}
