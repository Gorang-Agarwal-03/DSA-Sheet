package Array;

import java.util.Arrays;
import java.util.HashMap;

public class Array_Subset {
    public static String isSubset( long a1[], long a2[], long n, long m) {
        HashMap<Long, Integer>mp = new HashMap<>();
        for(long ele:a1){
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }
        for(long ele:a2){
            if(mp.getOrDefault(ele,0)>0){
                mp.put(ele, mp.get(ele)-1);
            }else{
                return "No";
            }
        }
        return "Yes";


        
        
    }
    public static void main(String[] args) {
        long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        long a2[] = {11, 3, 7, 1, 7};
        int n = a1.length;
        int m = a2.length;
        System.out.println(isSubset(a1, a2, n, m));
        
    }
}
