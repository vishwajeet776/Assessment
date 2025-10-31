package Arrays;

public class AssignCookies {
    public static void main(String[] args) {
        int[] g={1,2} ,s={1,2,3};
        int sum=0;
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < s.length; j++) {
                if (s[j]>=g[i] && sum<s.length){
                    sum++;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
