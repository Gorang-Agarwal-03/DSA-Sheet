package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class Two_Sum {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {

        // code here
      ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        Arrays.sort(arr);

        int j = arr.length-1;
        int i =0;

        while(i<j){
            if(arr[i]+arr[j]>0){
                j--;
            }
            else if(arr[i]+arr[j]<0){
                i++;
            }
            else if(arr[i]+arr[j] == 0){
                ArrayList<Integer>rslt = new ArrayList<>();
                rslt.add(arr[i]);
                rslt.add(arr[j]);
                results.add(rslt);
                i++;
                j--;
                while(i<j && arr[i] == arr[i-1]) i++;
                while(i<j && arr[j] == arr[j+1]) j--;
            }
        }
        return results;
    }
    //public static void main(String[] args) {
    //    int arr[] = {-1, 0, 1, 2, -1, -4};
    //    getPairs(arr);
    //    for(int i=0;i<arr.length;i++){
    //        System.out.print(arr[i]+" ");
    //    }
    //}
    
}
