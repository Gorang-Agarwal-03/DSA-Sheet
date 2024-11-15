package Array;

import java.util.HashMap;
import java.util.HashSet;

public class Occure_More_Than_K {
     public static  int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int count =0;
        int x = n/k;
        HashMap<Integer,Integer>mp = new HashMap<>();
        for(int i=0;i<n;i++){
            int a= mp.getOrDefault(arr[i],0)+1;
            mp.put(arr[i],a);

            if(a == x+1){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] ={3,1,2,2,1,2,3,3}; 
        int n = 8;
        int k = 4;
        System.out.println(countOccurence(arr, n, k));
    }
}
