package Arrays;

public class Kadens_Algo {
    static int maxSubarraySum(int[] arr) {

        // Your code here
        int sum =0;
        int maxi =arr[0];
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
            maxi = Math.max(maxi, sum);

            if(sum<0){
                sum =0;
            }
        }
        return maxi;
    }
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        int ans = maxSubarraySum(arr);
        System.out.println(ans);
    }

    
}
