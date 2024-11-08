package Arrays;

public class Minimum_Jump {
    static int minJumps(int[] arr) {
        // code here
        int max = 0;
        int maxRange = 0;
        int jumps = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            max = Math.max(max, i +arr[i]);
            if(maxRange == i){
                maxRange = max;
                jumps++;
                if(maxRange >=n-1){
                    return jumps;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;
        System.out.println(minJumps(arr));
    }
}
