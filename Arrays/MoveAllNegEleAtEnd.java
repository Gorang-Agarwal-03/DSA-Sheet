package Arrays;

public class MoveAllNegEleAtEnd {
    public static  void segregateElements(int[] arr) {
        // Your code goes here
        int n = arr.length;
        int j=0;
        int[] temp = new int[n];
        for(int i =0;i<n;i++){
            if(arr[i]>=0){
                temp[j++] = arr[i];
            }
        }
        for(int i =0;i<n;i++){
            if(arr[i]<0){
                temp[j++] = arr[i];
            }
        }
        for(int i =0;i<n;i++){
            arr[i] = temp[i];
        }
        for(int i = 0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
        segregateElements(arr);
    }
}
