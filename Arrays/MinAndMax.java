package Arrays;

public class MinAndMax {
    static int findMin(int arr[] , int n){
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    static int findMax(int arr[] , int n){
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }

        }
        return max;

    }
    public static void main(String[] args) {
        int arr[] = {3 ,2 ,1 ,56, 10000 ,167};
        int n = arr.length;
        System.out.println(findMin(arr ,n));
        System.out.println(findMax(arr ,n));
        
    }
    
}
