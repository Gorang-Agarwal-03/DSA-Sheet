package String;

import java.util.Stack;

public class Count_the_Reversals {
    public static int countMinReversals(String s) {
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='{'){
                st.push(ch);
            }
            else{
                if(st.isEmpty() || st.peek()=='}'){
                    st.push(ch);
                }
                else{
                    st.pop();
                }
            }

        }
        int ans=0,open=0,close=0;
        while(!st.isEmpty()){
            char top = st.pop();
            if(top =='{'){
                open++;
            }
            else{
                close++;
            }
        }
        ans = (int)((Math.ceil(open/2.0))+(Math.ceil(close/2.0)));
        return ans;

        
    }
    public static void main(String[] args) {
        String s = "}{{}}{{{";
        System.out.println(countMinReversals(s));
    }
}
