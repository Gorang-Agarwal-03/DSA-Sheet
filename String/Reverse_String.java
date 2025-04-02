package String;

public class Reverse_String {
    public static void reverseString(char[] s) {
        int n= s.length;
        int a=0;
        int b=n-1;
        while(a<b){
            char temp = s[a];
            s[a] = s[b];
            s[b] = temp;
            a++;
            b--;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
}
