package Array;

import java.util.ArrayList;

public class Factorial_of_largestnum {
    public static ArrayList<Integer> factorial(int n) {
        // code here
        ArrayList<Integer>rslt = new ArrayList<>();
        int size =0,c=0;
        rslt.add(0,1);
        size =1;
        int val =2;
        while(val<=n){
            for(int i=size-1;i>=0;i--){
                int temp = rslt.get(i)*val +c;
                rslt.set(i,temp%10);
                c=temp/10;
            }
            while(c!=0){
                rslt.add(0,c%10);
                c =c/10;
                size++;
            }
            val++;

        }
        return rslt;
    }
    public static void main(String[] args) {
        
    }
}
