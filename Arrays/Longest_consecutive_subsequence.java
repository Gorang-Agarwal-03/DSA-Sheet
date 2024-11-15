package Array;

import java.util.HashSet;

public class Longest_consecutive_subsequence {
    public static  int findLongestConseqSubseq(int[] arr) {
        int n= arr.length;
        if(n==0){
            return 0;
        }
        int longest = 1;
        HashSet<Integer>set = new HashSet<>();
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        for(int it :set){
            if(! set.contains(it-1)){
                int cnt = 1;
                int x = it;
                while(set.contains(x+1)){
                    x = x+1;
                    cnt++;
                }
                longest = Math.max(cnt, longest);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int arr[] = {2, 6, 1, 9, 4, 5, 3};
        System.out.println(findLongestConseqSubseq(arr));

        
    }
}
