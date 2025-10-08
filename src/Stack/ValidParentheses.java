package Stack;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s="[{()}]";
        Stack<Character> stck=new Stack<>();
        boolean ans=true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='[' || s.charAt(i)=='{' || s.charAt(i)=='('){
                stck.push(s.charAt(i));
            }else {
                if ((s.charAt(i)==']' && stck.pop()!='[') ||( s.charAt(i)!='}'&& stck.pop()!='{') || (s.charAt(i)!=')' && stck.pop()!='(')){
                    ans=false;
                    break;
                }
            }
        }
        System.out.println(ans);
    }
}
