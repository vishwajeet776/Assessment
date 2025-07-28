package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class MargeTowArray {
    public static void main(String[] args) {
        int[] arr1={2,4,6,8};
        int[] arr2={1,3,5,7};
        int k=5;

        int[] arr= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().toArray();

        int kth= IntStream.concat(Arrays.stream(arr1),Arrays.stream(arr2)).sorted().skip(k-1).findFirst().getAsInt();

        System.out.println(kth);

        for (int i:arr){
            System.out.print(i+" ");
        }


    }
}
