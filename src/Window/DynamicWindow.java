package Window;

public class DynamicWindow {
    public static void main(String[] args) {
        int[] arr={2,3,1,2,4,3};
        int target=7;
        int left=0;
        int maxLnt=0;
        int currentSum=0;
        for (int i = 0; i < arr.length; i++) {
            currentSum+=arr[i];
            maxLnt++;
            while (currentSum>target){
                currentSum-=arr[left];
                left++;
                maxLnt--;
            }
        }
        System.out.println(maxLnt);
    }
}
