package String;

public class Longest_Repeating {
        public static int LongestRepeatingSubsequence(String s){
            String a=new String(s);
            int m=s.length();
            int n=a.length();
            int[][] dp=new int[m+1][n+1];
            int ans=lcsUtil(s,a,m,n,dp);
            return ans;
        }
        static int lcsUtil(String a,String b,int m,int n,int[][] dp){
            for(int i=1;i<=m;i++){
                for(int j=1;j<=n;j++){
                    if(a.charAt(i-1)==b.charAt(j-1) && i!=j){
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                    else{
                        dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                    }
                }
            }
            return dp[m][n];
        }
        
        public static void main(String[] args) {
            String s = "pfoslsszfx";
            int a = LongestRepeatingSubsequence(s);
            System.out.println(a);
        }
}


// ------------------------------------Using recursion----------------------------------------------------------------

/*public static int rec(String s1, String s2,int i,int j){
    if(i==s1.length() || j== s2.length()){
        return 0;
    }
    else if(s1.charAt(i) == s2.charAt(j) && i!=j){
        return (1+rec(s1, s2, i+1, j+1));
    }
    else{
        int c1 = rec(s1, s2, i+1, j);
        int c2 = rec(s1, s2, i, j+1);

        return (Math.max(c1, c2));
    }  
}
public static int LongestRepeatingSubsequence(String s) {
    return rec(s, s, 0, 0);
}*/

/* -----------------------------------------------------Bruite force-----------------------------------------------*/    
  
/*String copy = s;
    int ans =0;
    int n=s.length();
    char arr1[] = new char[n];
    char arr2[] = new char[n];

    for(int i=0;i<n;i++){
        arr1[i] = s.charAt(i);
    }
    for(int i=0;i<n;i++){
        arr2[i] = copy.charAt(i);
    }
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(s.charAt(i) == copy.charAt(j) && i!=j){
                ans++;
                break;
            }
        }
        }
        return ans;*/
