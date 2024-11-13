package Array;

import java.util.HashSet;

public class SubArray_With_0sum {
    static boolean findsum(int arr[]) {
        // Your code here
        int n = arr.length;
        int sum = 0;
        HashSet<Integer> presum = new HashSet<>();
        for(int i =0;i<n;i++){
            sum = sum+arr[i];
            if(sum ==0 || presum.contains(sum)){
                return true;
            }
            presum.add(sum);

        }
        return false;
    }
    public static void main(String[] args) {
        int arr[] = {4, 2, -3, 1, 6};
        System.out.println(findsum(arr));
        
    }
}
