package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Triplet_Sum_Array {
    public static boolean find3Numbers(int arr[], int n, int x) {
       for(int i=0;i<n-2;i++){
        HashSet<Integer>st = new HashSet<>();
        int element = x-arr[i];
        for(int j=i+1;j<n;j++){
            if(st.contains(element-arr[j])){
                return true;
            }
            st.add(arr[j]);
        }
       }
       return false;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,45,6,10,8};
        int n = 6;
        int x =13;
        System.out.println(find3Numbers(arr, n, x));
    }
}
