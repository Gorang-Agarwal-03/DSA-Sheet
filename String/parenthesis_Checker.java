package String;

import java.util.Stack;

public class parenthesis_Checker {
    static boolean isBalanced(String s) {
        Stack<Character>st = new Stack<>();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i) =='{' || s.charAt(i) =='(' ||s.charAt(i) =='['){
                st.push(s.charAt(i));
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char ch =st.peek();
                if(ch =='(' && s.charAt(i)==')'|| ch =='[' && s.charAt(i)==']' || ch =='{' && s.charAt(i)=='}'){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }
        return st.isEmpty();
        
    }
    public static void main(String[] args) {
        String s = "[{()}]";
        System.out.println(isBalanced(s));
}
}
