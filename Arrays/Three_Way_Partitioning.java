package Array;

public class Three_Way_Partitioning {
    public static void swap(int arr[],int l,int r){
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;
    }
    static void threeWayPartition(int arr[] , int a,int b){
        int n = arr.length;
        int left=0;
        int right = arr.length-1;
        for(int i=0;i<=right;i++){
            if(arr[i]<a){
                swap(arr,left,i);
                left++;
            }
            else if(arr[i]>b){
                swap(arr,right,i);
                right--;
                i--;
            }

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4};
        int a = 1;
        int b = 2;
        threeWayPartition(arr, a, b);
        
    }
}
