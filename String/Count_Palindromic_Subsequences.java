package String;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Count_Palindromic_Subsequences {
    static int rec(String s,int[][]dp,int i,int j){
        if(i==j) return 1;
        if(i>j) return 0;

        if(dp[i][j] !=-1){
            return dp[i][j];
        }
        if(s.charAt(i) == s.charAt(j)){
            dp[i][j] =1 + rec(s, dp, i+1, j) + rec(s, dp, i, j-1);
        }
        else{
            dp[i][j] = rec(s, dp, i+1, j)+ rec(s, dp, i, j-1)-rec(s, dp, i+1, j-1);
        }
        return dp[i][j];

    }
    static int countPS(String s) {
        int n =s.length();
        int[][]dp = new int[n][n];
        for(int[]row:dp){
            Arrays.fill(row, -1);
        }
        return rec(s, dp, 0, n-1);

        
    }
    public static void main(String[] args) {
        String s ="aab";
        System.out.println(countPS(s));
    }
}
