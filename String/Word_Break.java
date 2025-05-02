package String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Word_Break {
    private static int[] dp;

    public static  boolean Solve(String s,Set<String>st ,int i){
        // base Case
        if(i==s.length()){
            return true;
        }
        if(dp[i] != -1){
            return dp[i]==1;
        }
        // recursive Case
        String temp = "";
        for(int j=i;j<s.length();j++){
            temp+=s.charAt(j);
            if(st.contains(temp)){
                if(Solve(s, st, j+1)){
                    return true;
                }
            }
        }
        dp[i] =0;
        return false;
    }
    public static  boolean wordBreak(String s, String[] dictionary) {
        int n = s.length();
        dp=new int[n];
        Arrays.fill(dp, -1);

        Set<String>st = new HashSet<>();
        for(String a:dictionary){
            st.add(a);
        }   
        return Solve(s, st, 0);
        
    }
    public static void main(String[] args) {
        String s = "ilike";
        String Dictionary[] = {"i", "like", "gfg"};
       System.out.println(wordBreak(s, Dictionary));
    }
}
