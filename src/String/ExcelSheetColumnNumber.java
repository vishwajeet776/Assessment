package String;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String columnTitle = "AB";
        int a=0;

        for (int i = 0; i < columnTitle.length(); i++) {
             a=a*26+(columnTitle.charAt(i)-'A'+1);

        }
        System.out.println(a);

    }
}
