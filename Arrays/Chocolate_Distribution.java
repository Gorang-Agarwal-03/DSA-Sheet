package Array;

import java.util.ArrayList;
import java.util.Collections;

public class Chocolate_Distribution {
    public static long findMinDiff(ArrayList<Integer>arr,int m){
        int n = arr.size();
        if(n==0) return 0;
        Collections.sort(arr);
        long result =Long.MAX_VALUE;

        for(int i=0;i<n-m+1;i++){
            int minElement = arr.get(i);
            int maxElement = arr.get(n+m-1);
            result = Math.min(result, maxElement-minElement );
        }
        return result;
    }
    public static void main(String[] args) {
        int a[] = {3,4,1,9,56,7,9};
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i=0;i<arr.size();i++){
            arr.add(i,a[i]);
        }
        int m =5;
        System.out.println(findMinDiff(arr,m));
        
    }
}
