package String;

public class Palindrome {
    static boolean isPalindrome(String s) {
        int n =s.length();
        String X = "";
        for(int i=0;i<n;i++){
            X = s.charAt(i)+X;
        }
        if(s.equalsIgnoreCase(X)){
            return true;
        }
        else{
            return false;
        }

        }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(isPalindrome(s));  
    }
}
