package String;

import java.util.*;

public class Sub_Sequence_of_String {
    public  static void Sequence(String s,String prev,int i){
        int n = s.length();
        if(i ==n){
            System.out.println(prev);
            return;
        }
        //Chose
        Sequence(s, prev+s.charAt(i), i+1);
        //Reject 
        Sequence(s,prev,i+1);
    }
    public static void main(String[] args) {
        String s ="abc";
        Sequence(s,"",0);

    }
    
}

        


