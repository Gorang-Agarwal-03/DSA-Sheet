package String;

public class Longest_Palindrome {
    static String longestPalindrome(String s) {
        int start =0,end=0,len=0;
        int n = s.length();

        for(int i=0;i<n;i++){
            int x = i-1;
            int y = i+1;
            while(x>=0 && y<n && s.charAt(x) == s.charAt(y)){
                if(y-x+1 >len){
                    len = y-x+1;
                    start = x;
                    end = y;
                }
                x--;
                y++;
            }
            x=i-1;
            y = i;
            while(x>=0 && y<n && s.charAt(x) == s.charAt(y)){
                if(y-x+1 >len){
                    len = y-x+1;
                    start = x;
                    end = y;
                }
                x--;
                y++;
            }
        }
        StringBuilder res = new StringBuilder();
        for(int i=start;i<=end;i++){
            res.append(s.charAt(i));
        }
        return res.toString();
        
    }
    public static void main(String[] args) {
        String s = "forgeeksskeegfor";
        String ans = longestPalindrome(s);
        System.out.println(ans);
    }
}
