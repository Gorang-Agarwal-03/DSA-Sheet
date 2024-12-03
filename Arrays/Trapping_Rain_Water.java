package Array;
public class Trapping_Rain_Water {
    public static int trappingWater(int arr[]) {
        int n = arr.length;
        int right[] = new int[n];
        int left[] = new int[n];
        left[0] = arr[0];
        for(int i=1;i<n;i++){
            left[i] = Math.max(left[i-1], arr[i]);
        }
        right[n-1] = arr[n-1];
        for(int i=n-2;i>0;i--){
            right[i] = Math.max(right[i+1], arr[i]);
        }
        int ans =0;
        for(int i=0;i<n;i++){
            if(arr[i]<left[i] && arr[i]< right[i]){
                
            ans += (Math.min(left[i],right[i])-arr[i]);
            }
        }
        return ans;
  
    }
    public static void main(String[] args) {
        int arr[] = {3 ,0 ,0 ,2 ,0 ,4};
        System.out.println(trappingWater(arr));
    }
    
}
