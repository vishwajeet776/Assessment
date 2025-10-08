package Window;

public class DynamicWindow {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int target=7;
        int maxLen=0;
        int totalSum=0;
        int left=0;
        for (int right = 0; right < arr.length; right++) {
            totalSum+=arr[right];
            maxLen++;
            while (totalSum>target){
                totalSum-=arr[left];
                left++;
                maxLen--;
            }
        }
        System.out.println(maxLen);
    }
}
