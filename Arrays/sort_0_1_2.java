package Arrays;

public class sort_0_1_2 {
        // Function to sort an array of 0s, 1s, and 2s
        public static void sort012(int[] arr) {
            // code here
            int zero = 0;
            int one = 0;
            int two = 0;
            int n = arr.length;
            for(int i =0;i<n;i++){
                if(arr[i]==0){
                    zero++;
                }
                else if(arr[i] == 1){
                    one++;
                }
                else{
                    two++;
                }
            }
            for(int i=0;i<zero;i++){
                arr[i] =0;
            }
            for(int i=zero;i<zero+one;i++){
                arr[i] = 1;
            }
            for(int i =zero+one;i<zero+one+two;i++){
                arr[i] = 2;
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            
            
        }
        public static void main(String[] args) {
            int arr[] = {0,1,2,2,1,0};
            sort012(arr);
        }
    }

