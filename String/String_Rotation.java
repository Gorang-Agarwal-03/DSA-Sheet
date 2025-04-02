package String;

public class String_Rotation {
    public static boolean areRotations(String s1, String s2) {
        String temp = s1+s1;

        if(temp.contains(s2)){
            return true;
        }
        return false;
        
    }
    public static void main(String[] args) {
        String s1="abcd";
        String s2="cdab";
        boolean ans=areRotations(s1, s2);
        System.out.println(ans);
    }
}
