package Arrays;

import java.util.Arrays;

public class MinimizeTheHeight {
    static int getMinDiff(int[] arr, int k) {
        // code here
        int n = arr.length;
        if(n==1) return 0;
        
        Arrays.sort(arr);
        int diff = arr[n-1] - arr[0];
        
        int min , max;
        for(int i=1;i<n;i++){
            if(arr[i]-k<0) continue;
            min = Math.min(arr[0]+k , arr[i]-k);
            max = Math.max(arr[i-1]+k , arr[n-1]-k);
            diff = Math.min(diff,max-min);
            
        }
        return diff;
    }
    public static void main(String[] args) {
        int arr[] = {1, 5, 8, 10};
        int k=2;
       int ans= getMinDiff(arr, k);
       System.out.println(ans);
    }
}
