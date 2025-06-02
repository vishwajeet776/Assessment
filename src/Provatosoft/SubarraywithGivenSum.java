package Provatosoft;

public class SubarraywithGivenSum {
    public static void main(String[] args) {
        int[] arr ={1, 4, 20, 3, 10, 5};
        int target=33;
       int s=0,e=0,sum=0;
       while (e<arr.length){

           sum+=arr[e];
           while (sum>target){
               sum-=arr[s];
               s++;
           }

           if (sum==target){
               System.out.println(arr[s]+"<---->"+arr[e]);
           }
           e++;
       }
    }
}
