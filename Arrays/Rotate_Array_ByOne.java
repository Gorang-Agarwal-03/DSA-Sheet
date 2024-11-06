package Arrays;

public class Rotate_Array_ByOne {
    public static void rotate(int[] arr) {
        // code here
        int j = arr.length-1;
        int i =0;
        while(i!=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
        }
        for(int g=0;g<arr.length;g++){
            System.out.print(arr[g]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        rotate(arr);

    }
}
